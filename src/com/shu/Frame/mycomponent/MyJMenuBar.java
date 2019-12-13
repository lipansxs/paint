package com.shu.Frame.mycomponent;

import com.shu.Frame.constant.MyJMenuBarConstant;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @Auther: 树先生
 * @Date:2019/12/9
 * @Description:com.shu.mainFrame
 * @version:1.0
 * @Purpose: 主界面菜单栏
 */
public class MyJMenuBar extends JMenuBar {

    /***
     * 菜单栏有一个 “文件”菜单项
     */
    private JMenu fileJMenu = new JMenu("文件(F)");
    private JMenuItem newFileItem = new JMenuItem("新建(N)");
    private JMenuItem openItem = new JMenuItem("打开(o)");
    private JMenuItem saveItem = new JMenuItem("保存(s)");
    private JMenuItem exitItem = new JMenuItem("退出(x)");
    
    /** 
     * 初始化文件菜单项
     * @param
     * @return void
     * @author 树先生
     * @date 2019/12/9 10:13 
     */       
            
    public void initFileJMenu (){
        fileJMenu.setFont(MyJMenuBarConstant.FONT); //为菜单设置字体
        fileJMenu.setMnemonic(KeyEvent.VK_F);       //设置按键快速访问

        /***
         * 为菜单添加菜单项
         */

        //添加新建文件的菜单项
        this.newFileItem.setFont(MyJMenuBarConstant.FONT);
        this.newFileItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        this.fileJMenu.add(newFileItem);

        //添加打开文件的菜单项
        this.openItem.setFont(MyJMenuBarConstant.FONT);
        this.openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        this.fileJMenu.add(openItem);

        //添加保存文件的菜单项
        this.saveItem.setFont(MyJMenuBarConstant.FONT);
        this.saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        this.fileJMenu.add(saveItem);

        //添加一个分隔符
        this.fileJMenu.addSeparator();

        //添加退出菜单项
        this.exitItem.setFont(MyJMenuBarConstant.FONT);
        this.exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        this.fileJMenu.add(exitItem);
    }


    public MyJMenuBar(){
        this.initFileJMenu();
        this.add(fileJMenu);
    }
}
