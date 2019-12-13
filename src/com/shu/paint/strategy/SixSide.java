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
public class SixSide extends Shape {

    public SixSide(){
        super();
        this.shapeName = "六边形";
    }

    public SixSide(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "六边形";

    }

    public SixSide(MyColor color){
        super(color);
        this.shapeName = "六边形";

    }

    public SixSide(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "六边形";

    }


    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        int width = endPoint.x - startPoint.x;
        int height = endPoint.y - startPoint.y;

        int[] xPoints = {startPoint.x, startPoint.x, startPoint.x + width/2, endPoint.x, endPoint.x, startPoint.x + width/2};
        int[] yPoints = {startPoint.y + height/4, startPoint.y + height*3/4, endPoint.y, startPoint.y + height*3/4, startPoint.y + height/4, startPoint.y};
        g.drawPolygon(xPoints, yPoints, 6);
    }
}
