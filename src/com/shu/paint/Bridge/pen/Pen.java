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
public class Pen {
    
    /***
     * 画笔线条的粗细对象
     */
    protected LineThickness lineThickness;

    /** 
     * 设置画笔线条的粗细
     * @param lineThickness 线条粗细对象
     * @return void
     * @author 树先生
     * @date 2019/12/11 9:53 
     */       
            
    public void setLineThickness(LineThickness lineThickness) {
        this.lineThickness = lineThickness;
    }

    /** 
     * 获取画笔线条粗细，单位为px
     * @param
     * @return int 像素大小
     * @author 树先生
     * @date 2019/12/11 9:53 
     */       
            
    public LineThickness getLineThickness(){
        return this.lineThickness;
    }

    /** 
     * 设置线条的颜色
     * @param color 新设置的颜色
     * @return void
     * @author 树先生
     * @date 2019/12/11 9:58 
     */       
            
    public void setColor(MyColor color){
        this.lineThickness.setColor(color);
    }

    /** 
     * 获取线条的颜色
     * @param
     * @return java.awt.Color
     * @author 树先生
     * @date 2019/12/11 9:59 
     */       
            
    public MyColor getColor(){
        return this.lineThickness.getColor();
    }
    
    /** 
     * 默认构造器构造默认的属性
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:23 
     */       
            
    public Pen(){
        this.lineThickness = new LineThickness();
    }

    /** 
     * 指定一个线条粗细对象构造一支笔
     * @param lineThickness 指定的线条粗细
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:24 
     */       
            
    public Pen(LineThickness lineThickness){
        this.lineThickness = lineThickness;
    }

    /** 
     * 指定一个颜色创建一支笔
     * @param color 指定的笔的颜色
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:25 
     */       
            
    public Pen(MyColor color){
        this();
        this.lineThickness.setColor(color);
    }

    /** 
     * 指定线条粗细对象和颜色创建一支笔
     * @param lineThickness	
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:27 
     */       
            
    public Pen(LineThickness lineThickness, MyColor color){
        this.lineThickness = lineThickness;
        this.lineThickness.setColor(color);
    }

}
