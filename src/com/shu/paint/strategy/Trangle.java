package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 直角三角形
 */
public class Trangle extends Shape {

    public Trangle(){
        super();
        this.shapeName = "直角三角形";
    }

    public Trangle(MyColor color){
        super(color);
        this.shapeName = "直角三角形";
    }

    public Trangle(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "直角三角形";
    }

    public Trangle(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "直角三角形";

    }

    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {

        int[] xPoint = {startPoint.x, startPoint.x, endPoint.x};
        int[] yPoint = {startPoint.y, endPoint.y, endPoint.y};

        g.drawPolygon(xPoint, yPoint, 3);

    }
}
