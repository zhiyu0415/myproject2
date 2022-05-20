package com.fish.ui;

import javax.swing.*;//找這個資料夾
import java.awt.*;

public class MyWin {
    //swing,SWT,JavaFX視窗類別庫
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//關掉視窗的同時停止程式
        //add component加元件
        JButton button = new JButton("OK");
        //Layout
        //frame.setLayout(new BorderLayout());//常用
        frame.setLayout(new FlowLayout());//流水性，向右排序
        frame.add(button);//沒有特別說明會直接放在C位，並占滿畫面
        MyActionListener listener = new MyActionListener();//監聽器
        button.addActionListener(listener);//按按鈕想要有反應->建立class　MyActionListener
        frame.add(new JButton("testing"));
        /*frame.add(new JButton("testing"));
        frame.add(new JButton("testing"));
        frame.add(new JButton("testing"));
        frame.add(new JButton("testing"));
        frame.add(new JButton("testing"));
        frame.add(new JButton("testing"));*/

        frame.setVisible(true);
        System.out.println("END?");
    }


}
