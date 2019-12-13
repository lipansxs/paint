package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.Black;
import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose:
 */
public abstract class Shape {


    /***
     * 形状的名字，后面通过这个名字来画相应的图形
     */
    protected String shapeName;

    /***
     * 默认形状的线条粗细和颜色都是默认的
     */
    protected LineThickness lineThickness;

    /** 
     * 默认构造器
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:45 
     */       
            
    public Shape(){
        this.lineThickness = new LineThickness(); //设置图形边框大小、颜色为默认的
    }

    /** 
     * 指定一个线条粗细对象构造器
     * @param lineThickness
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:47 
     */       
            
    public Shape(LineThickness lineThickness){
        this.lineThickness = lineThickness;
    }

    /** 
     * 指定一个颜色对象构造器
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:48 
     */       
            
    public Shape(MyColor color){
        this.lineThickness.setColor(color);
    }

    /** 
     * 同时指定线条粗细对象和颜色对象
     * @param lineThickness	
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:49 
     */       
            
    public Shape(LineThickness lineThickness, MyColor color){
        this.lineThickness = lineThickness;
        this.lineThickness.setColor(color);
    }

    /** 
     * 获取形状的名字
     * @param
     * @return java.lang.String
     * @author 树先生
     * @date 2019/12/11 9:47 
     */       
            
    public String getShapeName(){
        return this.shapeName;
    }

    /** 
     * 获取形状的颜色
     * @param
     * @return java.awt.Color 形状的颜色
     * @author 树先生
     * @date 2019/12/11 9:47 
     */       
            
    public MyColor getColor() {
        return this.lineThickness.getColor();
    }

    /** 
     * 获取形状的颜色
     * @param color	新设置的图形边框的颜色
     * @return java.awt.Color
     * @author 树先生
     * @date 2019/12/11 9:48 
     */       
            
    public void setColor(MyColor color){
        this.lineThickness.setColor(color);
    }
    
    /** 
     * 设置线条粗细对象
     * @param lineThickness 新设置的线条粗细对象
     * @return void
     * @author 树先生
     * @date 2019/12/11 14:42 
     */       
            
    public void setLineThickness(LineThickness lineThickness){
        this.lineThickness = lineThickness;
    }

    /** 
     * 获取图形边框的粗细
     * @param
     * @return float
     * @author 树先生
     * @date 2019/12/11 14:42 
     */       
            
    public float getLineThickness(){
        return this.lineThickness.getLineThickness();
    }

    public void draw (Graphics g, Point startPoint, Point endPoint){
        Graphics2D g2D = (Graphics2D)g;             //强制转型

        /***
         * 下面这句代码是用来 图形抗锯齿呈现，使得图形不会有锯齿出现
         */
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Stroke strokeBak = g2D.getStroke();         //备份当初画笔的大小配置Stroke
        Color colorBak = g2D.getColor();

        g2D.setStroke(new BasicStroke(this.getLineThickness()));
        g2D.setColor(this.getColor().getColor());

        this.drawslef(g2D, startPoint, endPoint); //利用模板方法模式的钩子函数

        g2D.setStroke(strokeBak);                   //恢复备份
        g2D.setColor(colorBak);

        g2D.dispose();                             //释放Graphics所占用的资源
    }
    
    protected abstract void drawslef(Graphics2D g, Point startPoint, Point endPoint);
}
