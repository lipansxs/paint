package com.shu.paint.Bridge.pen;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.pen
 * @version:1.0
 * @Purpose:
 */
public class Brush extends Pen{

    public Brush(){
        super();
    }

    public Brush(LineThickness lineThickness){
        super(lineThickness);
    }

    public Brush(MyColor color){
        super(color);
    }

    public Brush(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
    }


    /**
     * 画指定的文字 在指定的位置
     * (未测试)
     * @param g	
     * @param msg	
     * @param point
     * @return void
     * @author 树先生
     * @date 2019/12/11 11:32 
     */       
            
    public void draw(Graphics g, String msg, Point point){
        Graphics2D g2d = (Graphics2D)g; //强制把画笔转为子类
        Stroke strokeBat = g2d.getStroke(); //备份原来的数据
        Color colorBat = g2d.getColor();    //备份颜色

        int size = (int)this.getLineThickness().getLineThickness();

        if (size < 16) {
            size = 16;
        }

        /***
         * 下面这句代码是用来 字符串抗锯齿呈现，使得字符串不会有锯齿出现
         */
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setColor(this.getColor().getColor()); //设置画笔的颜色为Brush的颜色
        g2d.setFont(new Font("楷体", Font.BOLD, size));//设置画笔的粗细和字体
        g2d.drawString(msg,point.x, point.y);

        g2d.setStroke(strokeBat); //恢复备份的数据
        g2d.setColor(colorBat);
    }


}
