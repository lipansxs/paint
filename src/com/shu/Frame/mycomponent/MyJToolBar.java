package com.shu.Frame.mycomponent;

import com.shu.Frame.mycomponent.button.ColorButton;
import com.shu.Frame.mycomponent.button.MyJButton;
import com.shu.Frame.mycomponent.panel.PaintJPanel;
import com.shu.paint.Bridge.color.*;
import com.shu.paint.Bridge.line.EightPx;
import com.shu.paint.Bridge.line.FourPx;
import com.shu.paint.Bridge.line.SixPx;
import com.shu.paint.Bridge.pen.Brush;
import com.shu.paint.Bridge.pen.Pencil;
import com.shu.paint.strategy.*;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/9
 * @Description:com.shu.mycomponent
 * @version:1.0
 * @Purpose: 界面上的工具栏
 */
public class MyJToolBar extends JToolBar {

    /***
     * 一个按钮数目计数器在数目达到一定的时候工具栏添加一个分隔符
     */
    public static int btnCount = 0;

    /***
     * 需要在工具栏上添加按钮
     */
    //橡皮檫按钮
    private MyJButton cleanJbt = new MyJButton("橡皮.png", "橡皮檫", "橡皮檫", false);

    //铅笔按钮
    private MyJButton pancileJbt = new MyJButton("铅笔.png", "铅笔(使用这个可以任意画图)", "铅笔", false);

    //填充按钮
    /***
     * 还没有实现
     */
    private MyJButton fillJbt = new MyJButton("填充.png", "填充(使用这个可以填充图形)", "填充", false);

    //文字按钮 （点击这个可以输入文字）
    private MyJButton wordJbt = new MyJButton("文字.png", "文字(使用这个可以写文字)", "文字", false);

    //4像素线条按钮
    private MyJButton fourPxLineJbt = new MyJButton("4像素线条.png", "4px线条", "1px", false);

    //6像素线条按钮
    private MyJButton sixPxLineJbt = new MyJButton("6像素线条.png", "6px线条", "2px", false);

    //8像素线条
    private MyJButton eightPxLineJbt = new MyJButton("8像素线条.png", "8px线条", "4px", false);


    /***
     * 创建两个面板用来放图形按钮和颜色按钮
     */
    private JPanel shapePanel = new JPanel();
    private JPanel colorPanel = new JPanel();

    /***
     * 创建各种各样的形状的图形按钮
     */


    //五边形fiveSideJbt
    private MyJButton fiveSideJbt = new MyJButton("五边形.png", "五边形", "五边形", true);


    //六边形sixSideJbt
    private MyJButton sixSideJbt = new MyJButton("六边形.png", "六边形", "六边形", true);


    //直线按钮strightLineJbt
    private MyJButton strightLineJbt = new MyJButton("直线.png", "直线", "直线", true);

    /***
     * 下面的图形都没有实现
     */


    //梯形
    private MyJButton trapezoidJbt = new MyJButton("梯形.png", "梯形", "梯形", true);


    //圆角矩形roundedRecJbt
    private MyJButton roundedRecJbt = new MyJButton("圆角矩形.png", "圆角矩形", "圆角矩形", true);


    //椭圆ovalJbt
    private MyJButton ovalJbt = new MyJButton("椭圆.png", "椭圆", "椭圆", true);


    //五角星pentagramJbt
    private MyJButton pentagramJbt = new MyJButton("五角星.png", "五角星", "五边形", true);


    //直角三角形trangleJbt
    private MyJButton trangleJbt = new MyJButton("直角三角形.png", "直角三角形", "五角星", true);


    //矩形recJbt
    private MyJButton recJbt = new MyJButton("矩形.png", "矩形", "矩形", true);


    //菱形diamondJbt
    private MyJButton diamondJbt = new MyJButton("菱形.png", "菱形", "菱形", true);


    //来一个颜色选择器
    private MyJButton colorChooseJbt = new MyJButton("调色板.png", "调色板", "调色板", false);


   //黑色
    private ColorButton blackJbt = new ColorButton("黑色", 0, 0, 0);

    //灰色50%
    private ColorButton halfPerGrayJbt = new ColorButton("灰色50%", 127, 127, 127);

    //深红色
    private ColorButton deepRedJbt = new ColorButton("深红色", 136, 0, 21);

    //红色
    private ColorButton redJbt = new ColorButton("红色", 237, 28, 36);

    //橙色orangeJbt
    private ColorButton orangeJbt = new ColorButton("橙色", 255, 127, 39);

    //橙色orangeJbt 黄色yellowJbt
    private ColorButton yellowJbt = new ColorButton("黄色", 255, 242, 0);

    //橙色orangeJbt 黄色yellowJbt 绿色greenJbt
    private ColorButton greenJbt = new ColorButton("绿色", 34, 177, 76);

    //橙色orangeJbt 黄色yellowJbt 绿色greenJbt 青绿verdureJbt
    private ColorButton verdureJbt = new ColorButton("青绿", 0, 163, 232);

    //橙色orangeJbt 黄色yellowJbt 绿色greenJbt 青绿verdureJbt 靛青indigoJbt
    private ColorButton indigoJbt = new ColorButton("靛青", 63, 72, 204);

    //橙色orangeJbt 黄色yellowJbt 绿色greenJbt 青绿verdureJbt 靛青indigoJbt 紫色purpleJbt
    private ColorButton purpleJbt = new ColorButton("紫色", 163, 73, 164);

    //白色whiteJbt

    private ColorButton whiteJbt = new ColorButton("白色", 255, 255, 255);

    //灰色25%gray25Jbt
    private ColorButton gray25Jbt = new ColorButton("灰色25%", 195, 195, 195);

    //褐色brownJbt

    private ColorButton brownJbt = new ColorButton("褐色", 185, 122, 87);


    //玫瑰色roseJbt
    private ColorButton roseJbt = new ColorButton("玫瑰色", 255, 174, 201);


    //金色goldJbt
    private ColorButton goldJbt = new ColorButton("金色", 255, 201, 14);


    //浅黄色lightYellJbt
    private ColorButton lightYellJbt = new ColorButton("浅黄色", 239, 228, 17);


    //酸橙色sourOrangeJbt
    private ColorButton sourOrangeJbt = new ColorButton("酸橙色", 181, 230, 29);


    //淡青绿色lightTurJbt
    private ColorButton lightTurJbt = new ColorButton("淡青绿色", 153, 217, 234);


    //蓝灰色grayBlueJbt
    private ColorButton grayBlueJbt = new ColorButton("蓝灰色", 112, 146, 190);


    //淡紫色lavendarJbt
    private ColorButton lavendarJbt = new ColorButton("淡紫色", 200, 191, 231);


    /** 
     * 在工具栏上添加按钮
     * @param
     * @return void
     * @author 树先生
     * @date 2019/12/11 19:15 
     */       
            
    private void addButton(){
        //铅笔（可以画任意的东西）
        this.add(this.pancileJbt);

        //填充
        this.add(this.fillJbt);

        //文字
        this.add(this.wordJbt);

        //橡皮檫
        this.add(this.cleanJbt);

        //4px线条
        this.add(this.fourPxLineJbt);

        //6px线条
        this.add(this.sixPxLineJbt);

        //8px线条
        this.add(this.eightPxLineJbt);

        this.shapePanel.add(this.fiveSideJbt);
        this.shapePanel.add(this.sixSideJbt);
        this.shapePanel.add(this.strightLineJbt);
        this.shapePanel.add(this.trapezoidJbt);
        this.shapePanel.add(this.roundedRecJbt);
        this.shapePanel.add(this.ovalJbt);
        this.shapePanel.add(this.pentagramJbt);
        this.shapePanel.add(this.trangleJbt);
        this.shapePanel.add(this.recJbt);
        this.shapePanel.add(this.diamondJbt);
        this.add(this.shapePanel);

        this.add(this.colorChooseJbt);

        this.colorPanel.add(this.blackJbt);
        this.colorPanel.add(this.halfPerGrayJbt);
        this.colorPanel.add(this.deepRedJbt);
        this.colorPanel.add(this.redJbt);
        this.colorPanel.add(this.orangeJbt);
        this.colorPanel.add(this.yellowJbt);
        this.colorPanel.add(this.greenJbt);
        this.colorPanel.add(this.verdureJbt);
        this.colorPanel.add(this.indigoJbt);
        this.colorPanel.add(this.purpleJbt);
        this.colorPanel.add(this.whiteJbt);
        this.colorPanel.add(this.gray25Jbt);
        this.colorPanel.add(this.brownJbt);
        this.colorPanel.add(this.roseJbt);
        this.colorPanel.add(this.goldJbt);
        this.colorPanel.add(this.lightYellJbt);
        this.colorPanel.add(this.sourOrangeJbt);
        this.colorPanel.add(this.lightTurJbt);
        this.colorPanel.add(this.grayBlueJbt);
        this.colorPanel.add(this.lavendarJbt);
        this.add(this.colorPanel);

    }


    /** 
     * 在按钮上添加监听器
     * @param
     * @return void
     * @author 树先生
     * @date 2019/12/11 19:34 
     */       
            
    private void addListener(){
        /***
         *
         *
         */
        //五角星pentagramJbt
        this.pentagramJbt.addActionListener(e->{
            PaintJPanel.setShape(new Pentagram());
        });

        //菱形diamondJbt
        this.diamondJbt.addActionListener(e->{
            PaintJPanel.setShape(new Diamond());
        });

        //矩形recJbt
        this.recJbt.addActionListener(e->{
            PaintJPanel.setShape(new Rec());
        });

        //直角三角形trangleJbt
        this.trangleJbt.addActionListener(e->{
            PaintJPanel.setShape(new Trangle());
        });

        //椭圆ovalJbt
        this.ovalJbt.addActionListener(e->{
            PaintJPanel.setShape(new Oval());
        });

        //圆角矩形roundedRecJbt
        this.roundedRecJbt.addActionListener(e->{
            PaintJPanel.setShape(new RoundedRec());
        });

        //梯形
        this.trapezoidJbt.addActionListener(e->{
            PaintJPanel.setShape(new Tapezoid());
        });

        //六边形sixSideJbt
        this.sixSideJbt.addActionListener(e->{
            PaintJPanel.setShape(new SixSide());
        });

        //五边形fiveSideJbt
        this.fiveSideJbt.addActionListener(e->{
            PaintJPanel.setShape(new FiveSide());
        });


        //为直线添加监听器
        this.strightLineJbt.addActionListener(e->{
            PaintJPanel.setShape(new StrightLine());
        });

        //为颜色选择器创建监听器
        this.colorChooseJbt.addActionListener(e->{
            PaintJPanel.setColor(new OtherColor(JColorChooser.showDialog(this, "请选择一种颜色", Color.BLACK)));
        });

        //淡紫色lavendarJbt
        this.lavendarJbt.addActionListener(e->{
            PaintJPanel.setColor(new Lavendar());
        });

        //蓝灰色grayBlueJbt
        this.grayBlueJbt.addActionListener(e->{
            PaintJPanel.setColor(new GrayBlue());
        });

        //淡青绿色lightTurJbt
        this.lightTurJbt.addActionListener(e->{
            PaintJPanel.setColor(new LightTur());
        });

        //酸橙色sourOrangeJbt
        this.sourOrangeJbt.addActionListener(e->{
            PaintJPanel.setColor(new SourOrange());
        });

        //浅黄色lightYellJbt
        this.lightYellJbt.addActionListener(e->{
            PaintJPanel.setColor(new LightYell());
        });

        //金色goldJbt
        this.goldJbt.addActionListener(e->{
            PaintJPanel.setColor(new Gold());
        });

        //玫瑰色roseJbt
        this.roseJbt.addActionListener(e->{
            PaintJPanel.setColor(new Rose());
        });

        //褐色brownJbt
        this.brownJbt.addActionListener(e->{
            PaintJPanel.setColor(new Brown());
        });

        //灰色25%gray25Jbt
        this.gray25Jbt.addActionListener(e->{
            PaintJPanel.setColor(new Gray25());
        });

        //白色whiteJbt
        this.whiteJbt.addActionListener(e->{
            PaintJPanel.setColor(new White());
        });

        //紫色purpleJbt
        this.purpleJbt.addActionListener(e->{
            PaintJPanel.setColor(new Purple());
        });

        //靛青indigoJbt
        this.indigoJbt.addActionListener(e->{
            PaintJPanel.setColor(new Indigo());
        });

        //青绿verdureJbt
        this.verdureJbt.addActionListener(e->{
            PaintJPanel.setColor(new Verdure());
        });

        //绿色greenJbt
        this.greenJbt.addActionListener(e->{
            PaintJPanel.setColor(new Green());
        });

        //黄色
        this.yellowJbt.addActionListener(e->{
            PaintJPanel.setColor(new Yellow());
        });

        //为橙色添加监听器
        this.orangeJbt.addActionListener(e->{
            PaintJPanel.setColor(new Orange());
        });

        //为红色添加监听器
        this.redJbt.addActionListener(e->{
            PaintJPanel.setColor(new Red());
        });

        //为深红色添加监听器
        this.deepRedJbt.addActionListener(e->{
            PaintJPanel.setColor(new DeepRed());
        });

        //为灰色50%添加监听器
        this.halfPerGrayJbt.addActionListener(e->{
            PaintJPanel.setColor(new HalfPerGray());
        });

        //为黑色按钮添加监听器
        this.blackJbt.addActionListener(e->{
            PaintJPanel.setColor(new Black());
        });

        //为8px线条添加监听器
        this.eightPxLineJbt.addActionListener(e->{
            PaintJPanel.setLineThickness(new EightPx());
        });

        //为6px线条添加监听器
        this.sixPxLineJbt.addActionListener(e->{
            PaintJPanel.setLineThickness(new SixPx());
        });

        //为4px线条添加监听器
        this.fourPxLineJbt.addActionListener(e->{
            PaintJPanel.setLineThickness(new FourPx());
        });

        //为毛笔按钮添加监听器
        this.wordJbt.addActionListener(e->{
            String msg = JOptionPane.showInputDialog("请输入要画的信息", null);
            PaintJPanel.setBrush(new Brush(), msg);
        });

        //为橡皮擦添加监听器
        this.cleanJbt.addActionListener(e->{
            PaintJPanel.setPencil(new Pencil(), true);
        });

        //为铅笔添加监听器
        this.pancileJbt.addActionListener(e->{
            PaintJPanel.setPencil(new Pencil(), false);
        });


    }
    /** 
     * 初始化工具栏,需要在添加按钮之前把按钮的监听器注册好，不然没有效果
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/9 17:12 
     */       
            
    public MyJToolBar(){
        super("画图工具栏");

        this.shapePanel.setLayout(new GridLayout(2, 5));
        this.shapePanel.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
        this.colorPanel.setLayout(new GridLayout(2, 10, 1, 1));

        //在按钮上添加监听器(在把按钮添加到工具栏上之前要把监听器注册好)
        this.addListener();
        //在工具栏上添加按钮
        this.addButton();
        //是否可以移动工具栏
        this.setFloatable(false);

    }
}
