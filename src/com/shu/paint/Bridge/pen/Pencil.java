package com.shu.paint.Bridge.pen;

import com.shu.paint.Bridge.color.MyColor;
import com.shu.paint.Bridge.line.LineThickness;
import com.shu.paint.strategy.Shape;
import com.shu.paint.strategy.StrightLine;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.pen
 * @version:1.0
 * @Purpose:
 */
public class Pencil extends Pen {

    public Pencil(){
        super();
    }

    public Pencil(LineThickness lineThickness){
        super(lineThickness);
    }

    public Pencil(MyColor color){
        super(color);
    }

    public Pencil(LineThickness lineThickness, MyColor color){
        super(lineThickness, color);
    }


    /** 
     * 在startPoint和endPoint之间画一个图形,如果shape为null就默认用直线
     * @param g	 画笔
     * @param shape	 需要画的图形
     * @param startPoint	开始的点
     * @param endPoint   结束的点
     * @return void
     * @author 树先生
     * @date 2019/12/11 14:14 
     */       
            
    public void draw(Graphics g, Shape shape, Point startPoint, Point endPoint){

        if (null == shape) {
            shape = new StrightLine();
        }
        shape.setColor(this.getColor());
        shape.setLineThickness(this.getLineThickness());

        shape.draw(g, startPoint, endPoint);
    }
}
