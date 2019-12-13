package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 菱形
 */
public class Diamond extends Shape {

    public Diamond(){
        super();
        this.shapeName = "菱形";
    }

    public Diamond(MyColor color){
        super(color);
        this.shapeName = "菱形";
    }

    public Diamond(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "菱形";
    }

    public Diamond(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "菱形";
    }


    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        int width = endPoint.x - startPoint.x;
        int height = endPoint.y - startPoint.y;

        int[] xPoints = {startPoint.x + width/2, startPoint.x, startPoint.x + width/2, endPoint.x};
        int[] yPoints = {startPoint.y, startPoint.y + height/2, endPoint.y, startPoint.y + height/2};

        g.drawPolygon(xPoints, yPoints, 4);
    }
}
