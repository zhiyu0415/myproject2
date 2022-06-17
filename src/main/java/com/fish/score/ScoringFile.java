package com.fish.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");//throws 執行catch 接著執行try以外的資訊
            /*try{
                int data = fileReader.read();
            }catch (IOException e){
                System.out.println("資料讀取失敗");
            }*/
            int data = fileReader.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("檔案讀取失敗");
        } catch (IOException e) {
            System.out.println("資料讀取失敗");
        }
        System.out.println("testing");
    }
}
