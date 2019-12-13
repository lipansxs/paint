package com.shu.Frame.mycomponent.button;

import com.shu.Frame.mycomponent.panel.PaintJPanel;
import com.shu.paint.strategy.StrightLine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: 树先生
 * @Date:2019/12/9
 * @Description:com.shu.paint.mycomponent.button
 * @version:1.0
 * @Purpose:
 */
public class MyJButton extends JButton {

    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public MyJButton(String flag){
        this.flag = flag;
    }

    /** 
     *
     * @param iconPath	按钮图标路径
     * @param tips	按钮的提示
     * @param isShapeButton	 是否是形状按钮
     * @return javax.swing.JButton
     * @author 树先生
     * @date 2019/12/10 10:45 
     */       
            
    public MyJButton(String iconPath, String tips, String flag, boolean isShapeButton){
        this(flag);

        if (isShapeButton) {
            this.setSize(15, 15);
            this.setContentAreaFilled(false); //设置按钮透明
        }else {
            this.setSize(32, 32);
        }

        //把传进来的图片进行压缩，然后让图片适应按钮的大小
        Image image = new ImageIcon("images/" +iconPath).getImage().getScaledInstance(this.getWidth(),
                this.getHeight(),
                Image.SCALE_AREA_AVERAGING);//Image.SCALE_AREA_AVERGING是图片压缩的一种算法

        //通过压缩的图片来设置按钮的图片
        this.setIcon(new ImageIcon(image));
        //设置按钮提示语
        this.setToolTipText(tips);
    }
}
