package com.shu.paint.Bridge.line;

import com.shu.paint.Bridge.color.MyColor;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.line
 * @version:1.0
 * @Purpose: 2px
 */
public class EightPx extends LineThickness {

    /** 
     * 在创建的的时候指定线条粗细
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:01 
     */       
            
    public EightPx(){
        this.lineThickness = 8;
    }

    /** 
     * 指定一个颜色创建
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:06 
     */       
            
    public EightPx(MyColor color){
        this();
        this.color = color;
    }
}
