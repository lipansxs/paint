package com.shu.paint.Bridge.line;

import com.shu.paint.Bridge.color.MyColor;

/**
 * @Auther: 树先生
 * @Date:2019/12/11
 * @Description:com.shu.paint.Bridge.line
 * @version:1.0
 * @Purpose: 1px
 */
public class SixPx extends LineThickness {

    /** 
     * 在创建这个对象的时候把线条大小设置为1px
     * @param
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:00 
     */       
            
    public SixPx(){
        this.lineThickness = 6;
    }

    /** 
     * 指定一个颜色创建线条粗细对象
     * @param color 线条的颜色
     * @return 
     * @author 树先生
     * @date 2019/12/11 11:05 
     */       
            
    public SixPx(MyColor color){
        this();
        this.color = color;
    }
}
