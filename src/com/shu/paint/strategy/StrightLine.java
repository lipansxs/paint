package com.shu.paint.strategy;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.strategy
 * @version:1.0
 * @Purpose: 直线
 */
public class StrightLine extends Shape {

    public StrightLine(){
        super();
        this.shapeName = "直线";
    }

    /** 
     * 指定一个颜色来构造一个直线对象
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 14:20 
     */       
            
    public StrightLine(MyColor color){
        super(color);
        this.shapeName = "直线";
    }

    public StrightLine(LineThickness lineThickness){
        super(lineThickness);
        this.shapeName = "直线";
    }

    public StrightLine(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
        this.shapeName = "直线";
    }

    /** 
     * 画直线
     * @param g
     * @param startPoint	
     * @param endPoint
     * @return void
     * @author 树先生
     * @date 2019/12/12 10:23 
     */       
            
    @Override
    protected void drawslef(Graphics2D g, Point startPoint, Point endPoint) {
        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);//画直线
    }

}
