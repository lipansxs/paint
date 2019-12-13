package com.shu.paint.decorate;

import com.shu.paint.strategy.Shape;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.decorate
 * @version:1.0
 * @Purpose:
 */
public abstract class Decorator extends Shape {

    /***
     * 需要装饰的图形，在子类构造时指定
     */
    protected Shape shape;

    /** 
     * 在子类中实现对于图形的装饰方法
     * @param g 画笔
     * @return void
     * @author 树先生
     * @date 2019/12/11 10:27 
     */

    protected abstract void drawSelf (Graphics g, Point startPoint, Point endPoint);
}
