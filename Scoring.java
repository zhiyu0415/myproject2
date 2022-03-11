package com.fish;

import javax.xml.namespace.QName;

public class Scoring {
    public static void main(String[] args) {
        Student tony=new Student("Tony");
        //tony.name = "Tony";
        tony.english = 98;
        tony.math = 100;
        tony.print();
        Student andy = new Student("Andy",77,95);
        andy.print();
        Student s=new Student();
        s.print();
        Student anne=new Student("Anne");
        //anne.name = "Anne";
        anne.english = 73;
        anne.math = 63;
        Student hank=new Student("Hank");
        //hank.name = "Hank";
        hank.english = 60;
        hank.math = 20;
        hank.print();
        Student tina=new Student("Tina");
        //tina.name = "Tina";
        tina.english = 59;
        tina.math = 77;
        tina.print();
        GraduateStudent Jane =new GraduateStudent("Jane",88,76,70);
        Jane.name = "Jane";
        Jane.print();//繼承副類別的屬性及方法，但建構子不會被繼承下來
    }
}
