package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 圆角矩形
 */
public class RoundedRec extends Shape{

    public RoundedRec(){
        super();
        this.shapeName = "圆角矩形";
    }

    public RoundedRec(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "圆角矩形";
    }

    public RoundedRec(MyColor color){
        super(color);
        this.shapeName = "圆角矩形";
    }

    public RoundedRec(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "圆角矩形";
    }


    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {

        int width = endPoint.x - startPoint.x;
        int height = endPoint.y - startPoint.y;

        if (width >= 0 && height >= 0) {
            g.drawRoundRect(startPoint.x, startPoint.y, width, height, 5, 5);
        }else if (width < 0 && height < 0){
            g.drawRoundRect(endPoint.x, endPoint.y, Math.abs(width), Math.abs(height), 5, 5);

        }else if (width<= 0 && height >= 0) {
            g.drawRoundRect(endPoint.x, startPoint.y, Math.abs(width), height, 5, 5);
        }else if (width >= 0 && height < 0) {
            g.drawRoundRect(startPoint.x, endPoint.y, width, Math.abs(height), 5, 5);
        }

    }
}
