package com.fish.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //類別裡面做設計:Fields,constructors,methods
    //constructors建構子
    public GuessFrame(){
        super();//建構子第一行，初始化設定
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        JButton button = new JButton("Hi");
        JLabel label = new JLabel("Zzzz...");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("Hello!");
            }
        });
        add(button);//左
        add(label);//右
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}