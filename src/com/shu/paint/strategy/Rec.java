package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import javax.sound.sampled.Line;
import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 矩形
 */
public class Rec extends Shape {

    public Rec(){
        super();
        this.shapeName = "矩形";

    }

    public Rec(MyColor color){
        super(color);
        this.shapeName = "矩形";
    }

    public Rec(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "矩形";
    }

    public Rec(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "矩形";
    }

    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        int[] xPoints = {startPoint.x, startPoint.x, endPoint.x, endPoint.x};
        int[] yPoints = {startPoint.y, endPoint.y, endPoint.y, startPoint.y};

        g.drawPolygon(xPoints, yPoints, 4);
    }
}
