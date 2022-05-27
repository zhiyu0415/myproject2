package com.fish.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //類別裡面做設計:Fields,constructors,methods
    //constructors建構子
    Random random = new Random();
    int secret = random.nextInt(100)+1;
    int Max = 100;
    int min = 0;
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("Zzzz...");
    JLabel range = new JLabel(min+" to "+Max);
    JLabel rule = new JLabel("Plesae enter : ");
    JTextField number = new JTextField(8);
    public GuessFrame(){
        super();//建構子第一行，初始化設定
        System.out.println("secret : "+secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                if( num > secret){
                    Max = num;
                    label.setText("smaller");
                    range.setText(min+" to "+Max);
                }else if( num < secret){
                    min = num;
                    label.setText("bigger");
                    range.setText(min+" to "+Max);
                }else{
                    label.setText("BINGO! The secret number is : "+secret);
                    range.setText("WIN!");
                }
            }
        });
        add(rule);
        add(range);
        add(number);
        add(button);
        add(label);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}