package com.shu.Frame.mycomponent.button;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/9
 * @Description:com.shu.paint.mycomponent.button
 * @version:1.0
 * @Purpose:
 */
public class ColorButton extends JButton{
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ColorButton(String tips, int r, int g, int b){
        this.color = new Color(r, g, b);

        this.setBackground(this.color);
        this.setSize(20, 20);
        this.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));

        this.setToolTipText(tips);
    }
}
