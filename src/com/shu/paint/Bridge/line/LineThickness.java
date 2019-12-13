package com.shu.paint.Bridge.line;

import com.shu.paint.Bridge.color.Black;
import com.shu.paint.Bridge.color.MyColor;

import javax.sound.sampled.Line;
import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.line
 * @version:1.0
 * @Purpose: 所有线条粗细的父类
 */
public class LineThickness {

    /***
     * 线条的颜色，设置默认颜色为黑色
     */
    protected MyColor color = new Black();

    /***
     * 线条的粗细,默认粗细为1px
     */
    protected float lineThickness;

    /** 
     * 线条默认构造器
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:51 
     */       
            
    public LineThickness(){
        this.lineThickness = 4.0f;
    }

    /** 
     * 指定一个颜色来构造线条对象
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:52 
     */       
            
    public LineThickness(MyColor color){
        this.color = color;
    }

    /** 
     * 获取线条的颜色
     * @param
     * @return java.awt.Color
     * @author 树先生
     * @date 2019/12/11 9:37 
     */       
            
    public MyColor getColor(){
        return this.color;
    }
    
    /** 
     * 获取线条的大小 单位是像素
     * @param
     * @return int 像素数
     * @author 树先生
     * @date 2019/12/11 9:38 
     */       
            
    public float getLineThickness(){
        return this.lineThickness;
    }

    /** 
     * 设置线条的颜色
     * @param color	新设置的颜色
     * @return void
     * @author 树先生
     * @date 2019/12/11 9:38 
     */       
            
    public void setColor(MyColor color){
        this.color = color;
    }

}
