package com.stu.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
    public static void main(String[] args) {
        //创建一个Java窗口
        Frame f = new Frame();
        //设定窗口大小
        f.setSize(800,600);
        //设定窗口大小是否可调整
        f.setResizable(false);
        //设定窗口标题
        f.setTitle("Tank War");
        //设置窗口可见
        f.setVisible(true);

        //添加window(窗口)监听器-new WindowAdapter()匿名内部类
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
