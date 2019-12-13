package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 五角星
 */
public class Pentagram extends Shape {

    public Pentagram(){
        super();
        this.shapeName = "五角星";
    }

    public Pentagram (LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "五角星";
    }

    public Pentagram(MyColor color){
        super(color);
        this.shapeName = "五角星";
    }

    public Pentagram(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "五角星";
    }


    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        int width = endPoint.x - startPoint.x;
        int height = endPoint.y - startPoint.y;

        int[] xPoints = {startPoint.x, endPoint.x, startPoint.x + width/4, startPoint.x + width/2, startPoint.x + width*3/4};
        int[] yPoints = {startPoint.y + height/3, startPoint.y + height/3, endPoint.y, startPoint.y, endPoint.y};

//        int[] xPoints = {startPoint.x + width/2, startPoint.x, startPoint.x + width/4, startPoint.x + width*3/4, endPoint.x};
//        int[] yPoints = {startPoint.y, startPoint.y + height/3, endPoint.y, endPoint.y, startPoint.y + height/3};

        g.drawPolygon(xPoints, yPoints, 5);
    }
}
