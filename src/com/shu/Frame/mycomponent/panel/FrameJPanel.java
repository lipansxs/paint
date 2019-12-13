package com.shu.Frame.mycomponent.panel;

import com.shu.Frame.mycomponent.MyJToolBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * @Auther: 树先生
 * @Date:2019/12/9
 * @Description:com.shu.mycomponent
 * @version:1.0
 * @Purpose: 这个类作为画板程序的最底层的面板
 */
public class FrameJPanel extends JPanel {

    /***
     * 在这个面板的最上面添加一个工具栏
     */
    private MyJToolBar toolBar = new MyJToolBar();

    /***
     * 在这个面板的中心添加一个画画用的面板
     */
    private PaintJPanel paintJPanel = new PaintJPanel();


    public FrameJPanel(){

        this.setLayout(new BorderLayout());
        this.add(toolBar, BorderLayout.PAGE_START);
        this.add(this.paintJPanel, BorderLayout.CENTER);
        this.addListener();
    }

    /** 
     * 添加监听器
     * @param
     * @return void
     * @author 树先生
     * @date 2019/12/12 8:48 
     */       
            
    private void addListener(){

    }
}
