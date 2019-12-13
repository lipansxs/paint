package com.shu.paint.Bridge.color;

import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.color
 * @version:1.0
 * @Purpose: 其他的任意颜色
 */
public class OtherColor extends MyColor {
    
    /**
     * 通过颜色选择器选择一个颜色，把这个颜色传进来
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 10:56 
     */
    public OtherColor(Color color){
        this.color = color;
    }
}
