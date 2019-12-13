package com.shu.paint.Bridge.line;

import com.shu.paint.Bridge.color.MyColor;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.line
 * @version:1.0
 * @Purpose: 4px
 */
public class FourPx extends LineThickness {

    /** 
     * 在创建对象的时候指定线条粗细
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:14 
     */       
            
    public FourPx(){
        this.lineThickness = 4;
    }

    /** 
     * 在创建对象时指定一个颜色和线条大小
     * @param color
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:15 
     */       
            
    public FourPx(MyColor color){
        this();
        this.color = color;
    }
}
