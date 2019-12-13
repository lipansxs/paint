package com.shu.Frame.mycomponent.panel;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.color.White;
import com.shu.paint.Bridge.line.FourPx;
import com.shu.paint.Bridge.line.LineThickness;
import com.shu.paint.Bridge.pen.Brush;
import com.shu.paint.Bridge.pen.Pencil;
import com.shu.paint.strategy.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

/**
 * @Auther: 树先生
 * @Date:2019/12/10
 * @Description:com.shu.paint.mycomponent.panel
 * @version:1.0
 * @Purpose:
 */
public class PaintJPanel extends JPanel {

    /***
     * 鼠标在画板上第一次点击的位置
     */
    private Point startPoint;

    /***
     * 鼠标在画板上松开的位置
     */
    private Point endPoint;

    /***
     * 在这个面板的下面添加一个显示位置的JLabel
     */
    private JLabel indexLabel = new JLabel();

    /***
     * 缓冲图上的画笔
     */
    private Graphics bfg;


    //------------------------------------------------------------------------------------
    int WIDTH;
    int HEIGHT;
    BufferedImage bufferedImage;
    /***
     * 下面是一段测试代码
     */
    private static Shape shape = null;                 //图形
    //private static MyColor color = null;               //颜色
    //private static LineThickness lineThickness = null; //线条粗细
    private static Pencil pencil = new Pencil();       //铅笔 默认就是铅笔
    private static Brush brush = null;                 //毛笔（文字）
    private static String msg = null;                 //毛笔要显示的文字

    /** 
     * 在工具面板点击相应的按钮后，创建对应的对象然后通过静态方法设置这些对象的值
     * @param shape
     * @return void
     * @author 树先生
     * @date 2019/12/11 20:15 
     */       
            
    public static void setShape(Shape shape){
        PaintJPanel.shape = shape;

        PaintJPanel.pencil = null; //只能是画笔或者图形
        PaintJPanel.brush = null; //不能同时又画笔和毛笔
    }

    public static void setColor(MyColor color){

        if (null != pencil) {
            PaintJPanel.pencil.setColor(color);
        }else if (null != PaintJPanel.brush) {
            PaintJPanel.brush.setColor(color);
        }else if (null != PaintJPanel.shape) {
            PaintJPanel.shape.setColor(color);
        }
        //PaintJPanel.color = color;
    }

    public static void setLineThickness(LineThickness lineThickness){

        //设置笔的大小
        if (null != PaintJPanel.brush) {
            PaintJPanel.brush.setLineThickness(lineThickness);
        }else if (null != PaintJPanel.shape) {
            PaintJPanel.shape.setLineThickness(lineThickness);
        }else {

            PaintJPanel.pencil = new Pencil(lineThickness, pencil.getColor());
//            MyColor colorBak = pencil.getColor();
//            PaintJPanel.pencil.setLineThickness(lineThickness);
//            PaintJPanel.pencil.setColor(colorBak);
        }

       // PaintJPanel.lineThickness = lineThickness;
    }

    public static void setPencil(Pencil pencil, boolean isEraser){

        if (isEraser) {
            PaintJPanel.pencil = pencil;
            pencil.setColor(new White());

        }else {
            PaintJPanel.pencil = pencil;
        }

        PaintJPanel.shape = null; //只能是画笔或者图形
        PaintJPanel.brush = null; //不能同时又画笔和毛笔
    }

    public static void setBrush(Brush brush, String msg){
        PaintJPanel.brush = brush;
        PaintJPanel.msg = msg;

        PaintJPanel.shape = null; //只能是画笔或者图形
        PaintJPanel.pencil = null; //不能同时又画笔和毛笔
    }

    //------------------------------------------------------------------------------------


    public void addListener() {

        this.addMouseListener(new MouseAdapter() {

            /***
             * 在鼠标离开画板时调用
             */
            @Override
            public void mouseExited(MouseEvent e) {
                indexLabel.setText("");
            }

            /**
             * 鼠标松开时调用
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = new Point(e.getX(), e.getY());

                if (null != PaintJPanel.shape) {
                    shape.draw(bufferedImage.getGraphics(), startPoint, endPoint);
                }else if (null != PaintJPanel.pencil) {

                }

                //在鼠标松开时画图形
//                pencil.draw(bufferedImage.getGraphics(), null, startPoint, endPoint);
//                shape.drawSelf(getGraphics(), startPoint, endPoint);
            }


            /**
             * 鼠标按下时调用
             */
            @Override
            public void mousePressed(MouseEvent e) {
                /***
                 * 在鼠标按下的时候设置起始点
                 */
                startPoint = new Point(e.getX(), e.getY());

                if (null != PaintJPanel.brush) {
                    brush.draw(bufferedImage.getGraphics(), PaintJPanel.msg, startPoint);
                    repaint();
                }
            }


        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            /***
             * 在组件上按下鼠标按钮然后拖动时调用。
             */
            @Override
            public void mouseDragged(MouseEvent e) {

                /***
                 * 实现 “画图过程” 思路：创建2张缓冲图片，在图片上画，然后在面板上画图片
                 * 在鼠标按钮释放的时候在第一张缓冲图片上画上图像
                 * 在拖动过程创建第二张缓冲图片，每动一下创建一张，在第二张图片上画上第一张图片（把原来的图像画上来）
                 *    然后在第二张图片上画图形，最后把图形画到面板上去
                 */
                endPoint = new Point(e.getX(), e.getY());

                /***
                 * 只要移动就创建缓冲图，并且设置好这个缓冲图画笔的一些属性
                 */
                BufferedImage bfImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);

                Graphics bgftemp = bfImage.getGraphics();
                bgftemp.setColor(getBackground());
                bgftemp.fillRect(0,0, bufferedImage.getWidth(),bufferedImage.getHeight());


                /***
                 * 画原来图上的内容
                 */
                bgftemp.drawImage(bufferedImage, 0, 0 , null);

                /***
                 * 根据在界面上不同的点击来画不同的东西
                 */
                if (null != PaintJPanel.shape) {
                    shape.draw(bgftemp, startPoint, endPoint);
                }else if (null != pencil) {
                    pencil.draw(bgftemp, null, startPoint, endPoint);
                    pencil.draw(bufferedImage.getGraphics(), null, startPoint, endPoint);
                    startPoint = endPoint;
                }

                //测试随意画
                //pencil.draw(bgftemp, null, startPoint, endPoint);

                /***
                 * 只要移动，就会把原来的图像和新的图像画上去，我们看到的就是这个
                 */
                getGraphics().drawImage(bfImage, 0, 0, null);
            }


            /***
             *
             * 在鼠标进入画板但是没有按鼠标时调用
             * 用来显示鼠标的位置
             */
            @Override
            public void mouseMoved(MouseEvent e) {
                indexLabel.setText(String.format("%03d, %03d", e.getX(), e.getY()) + "像素");
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //设置属性
        g.setColor(this.getBackground());
        g.fillRect(0, 0, 1920, 1080);
        g.drawImage(bufferedImage, 0, 0, null);

    }

    public PaintJPanel(){

        /***
         * 在监听器中可以获取到画笔Graphics对象，和宽带、高度
         */

        this.setSize(new Dimension(1000, 600));
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.add(this.indexLabel, BorderLayout.SOUTH);

        /***
         * 用来保存画板原来的图像，bufferedImage
         */
        bufferedImage = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);

        /***
         * 设置缓冲图片的画笔
         */
        bfg = bufferedImage.getGraphics();

        /***
         * 设置bufferedImage的画笔的属性
         *  获取面板的颜色，
         */
        //bfg.setColor(this.getBackground());

        /***
         * 把bufferedImage的背景设置为白色并且填充整个面板
         */
        bfg.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());

        System.out.println(bfg);

        this.addListener();

    }
}
