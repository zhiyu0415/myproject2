package com.fish.score;
//修飾字(子) Modifier:(1)public (2)default(package):只在同package裡可以用
// (3)private:只有同class的可以用，就算是子類別也不能用但是可以擁有(4)protected:給子類別的屬性，就算在不同package也可以使用


public class Student implements Printable{
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
@Override//防呆
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getaverage());
        if(getaverage()<60){
            System.out.print("*");
        }
        System.out.println();
    }

    /*public void print(){

        System.out.print(name+"\t"+english+"\t"+math+"\t"+getaverage());
        if(getaverage()<60){
            System.out.print("*");
        }
        System.out.println();
    }*/

}
