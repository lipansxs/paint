package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 圆形
 */
public class Tapezoid extends Shape {

    public Tapezoid(){
        super();
        this.shapeName = "梯形";
    }

    public Tapezoid(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "梯形";

    }

    public Tapezoid(MyColor color){
        super(color);
        this.shapeName = "梯形";
    }

    public Tapezoid(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "梯形";

    }



    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        int width = endPoint.x - startPoint.x;

        int[] xPoints = {startPoint.x, endPoint.x, startPoint.x + width * 3/4, startPoint.x + width /4};
        int[] yPoints = {endPoint.y, endPoint.y, startPoint.y, startPoint.y};

        g.drawPolygon(xPoints, yPoints, 4);


    }
}
