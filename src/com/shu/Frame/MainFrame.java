package com.shu.Frame;

import com.shu.Frame.mycomponent.MyJMenuBar;
import com.shu.Frame.mycomponent.panel.FrameJPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: 树先生
 * @Date:2019/12/9
 * @Description:com.shu.mainFrame
 * @version:1.0
 * @Purpose: 程序的主界面
 */
public class MainFrame extends JFrame {
    
    /***
     * 程序需要有一个面板，把组件放到这个面板上面
     * 在这个面板上面有：
     *  工具栏
     */
    private FrameJPanel jpanel = new FrameJPanel();

    /***
     * 在主界面里面有一个菜单栏
     */
    private MyJMenuBar menuBar = new MyJMenuBar();


    public MainFrame (){
        JFrame.setDefaultLookAndFeelDecorated(true);

        this.setJMenuBar(this.menuBar);  //设置主界面的菜单栏
        this.add(this.jpanel);


        /***
         * 下面的代码设置主界面的基本信息
         */
        this.setTitle("树先生的画图程序");
        this.setBounds(300, 200, 1000, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
