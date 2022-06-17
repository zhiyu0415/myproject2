package com.fish.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");//throws 執行catch 接著執行try以外的資訊
            BufferedReader reader = new BufferedReader(fileReader);
            //Jack,88,60
            String line = reader.readLine();
            while(line != null){
                //System.out.println(line);
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student student = new Student(name,english,math);
                student.print();
                line = reader.readLine();
            }
            /*try{
                int data = fileReader.read();
            }catch (IOException e){
                System.out.println("資料讀取失敗");
            }*/
            /*int data = fileReader.read();
            //System.out.println(data);//無資料之後變成-1
            while (data != -1){
                System.out.print((char) data);
                data = fileReader.read();
            }
            System.out.println();*/
        } catch (FileNotFoundException e) {
            System.out.println("檔案讀取失敗");
        } catch (IOException e) {
            System.out.println("資料讀取失敗");
        }
        System.out.println("testing");
    }
}
