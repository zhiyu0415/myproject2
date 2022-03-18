package com.fish;

public class Student {
    String name;
    int english;
    int math;
    int thesis;
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int english,int math){
        //this.name = name;
        this(name);//呼叫自己身上的建構子，執行7-9行程式
        this.english = english;
        this.math = math;
    }
    public Student(){
        //建構子，不可以有回傳值，可以有多個建構子，由個數參數區分，JAVA會預設一個建構子
        this("John",-1,-1);
    }
    public int getaverage(){
        return (english+math)/2;
    }
    public void print(){

        System.out.print(name+"\t"+english+"\t"+math+"\t"+getaverage());
        if(getaverage()<60){
            System.out.print("*");
        }
        System.out.println();
    }

}
