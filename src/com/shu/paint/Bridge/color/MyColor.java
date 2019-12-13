package com.shu.paint.Bridge.color;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.color
 * @version:1.0
 * @Purpose: 所有颜色的父类
 */
public class MyColor {
    protected Color color;

    /** 
     * 获取自定义颜色类的颜色
     * @param
     * @return java.awt.Color
     * @author 树先生
     * @date 2019/12/11 9:39 
     */       
            
    public Color getColor(){
        return this.color;
    }
}
