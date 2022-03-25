package com.fish.score;

public class GraduateStudent extends Student{//副類別，子類別
    /*public GraduateStudent(){
        // super();//自帶(送的)

     }*/
    public GraduateStudent(String name,
                           int english,
                           int math,
                           int thesis){
        /*this.name = name;
        this.english = english;
        this.math = math;*/
        super(name,english,math);//利用副類別
        this.thesis = thesis;

    }
    @Override//防呆，編譯上的錯誤
    public void print() {
        System.out.println(name+"\t"+english+"\t"+math+"\t"+getaverage()+"\t"+thesis);
    }
}