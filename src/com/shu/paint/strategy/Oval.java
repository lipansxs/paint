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
public class Oval extends Shape {

    public Oval(){
        super();
        this.shapeName = "椭圆";
    }

    public Oval(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "椭圆";

    }

    public Oval(MyColor color){
        super(color);
        this.shapeName = "椭圆";

    }

    public Oval(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "椭圆";

    }


    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        int width = endPoint.x - startPoint.x;
        int height = endPoint.y - startPoint.y;


        if (width >= 0 && height >= 0) {
            g.drawOval(startPoint.x, startPoint.y, width, height);
        }else if (width < 0 && height < 0){
            g.drawOval(endPoint.x, endPoint.y, Math.abs(width), Math.abs(height));
        }else if (width<= 0 && height >= 0) {
            g.drawOval(endPoint.x, startPoint.y, Math.abs(width), height);
        }else if (width >= 0 && height < 0) {
            g.drawOval(startPoint.x, endPoint.y, width, Math.abs(height));
        }

    }
}
