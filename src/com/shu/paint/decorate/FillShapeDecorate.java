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
public abstract class FillShapeDecorate extends Decorator {

    public FillShapeDecorate(Shape shape){
        this.shape = shape;
    }

    @Override
    protected abstract void drawslef(Graphics2D g, Point startPoint, Point endPoint);
}
