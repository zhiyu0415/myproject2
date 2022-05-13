package com.fish.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        students.add(new Student("Tony",98,100));
        students.add(new Student("Andy",77,95));
        students.add(new Student("Anne",33,63));
        students.add(new Student("Hank",60,77));
        students.add(new Student("Tina",59,20));
        students.add(new GraduateStudent("Jane",88,76,70));
        for (int i = 0; i < students.size(); i++) {
            students.get(i).print();
        }
        /*Student tony=new Student("Tony");
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
        hank.math = 77;
        hank.print();
        Student tina=new Student("Tina");
        //tina.name = "Tina";
        tina.english = 59;
        tina.math = 20;
        tina.print();
        GraduateStudent Jane =new GraduateStudent("Jane",88,76,70);
        Jane.name = "Jane";
        Jane.print();//繼承副類別的屬性及方法，但建構子不會被繼承下來*/
    }
}
