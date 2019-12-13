package com.shu.paint.strategy;

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
public class FiveSide extends Shape {

    public FiveSide(){
        super();
        this.shapeName = "五边形";
    }

    public FiveSide(MyColor color){
        super(color);
        this.shapeName = "五边形";

    }

    public FiveSide(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "五边形";

    }

    public FiveSide(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "五边形";
    }


    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {

        int width = endPoint.x - startPoint.x;
        int height = endPoint.y - startPoint.y;

        int[] xPoints = {startPoint.x + width/2, startPoint.x, startPoint.x + width/4, startPoint.x + width*3/4, endPoint.x};
        int[] yPoints = {startPoint.y, startPoint.y + height/3, endPoint.y, endPoint.y, startPoint.y + height/3};

        g.drawPolygon(xPoints, yPoints, 5);
    }
}
