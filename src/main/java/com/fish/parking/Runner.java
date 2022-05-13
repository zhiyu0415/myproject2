package com.fish.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "8:00";
        String exitTime = "11:30";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");//需要查格式可直接google
        //Exception 例外 VS Error 錯誤
        Date d = null;
        try {
            d = sdf.parse(enterTime);//將物件轉換成時間
        }catch (Exception e){
            System.out.println("Wrong format");
        }
        //Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());//取得時間
        //long ms = 3*60*60*1000;//加三小時(毫秒)
        try {
            Date d2 = new Date();
            d2 = sdf. parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)(d2.getTime()-d.getTime())/1000/60;//將long轉型成int
            System.out.println(mins);
            int fee = 0;
            if(mins-(mins/60)*60 < 15 ) {
                fee = 30*(mins/60);
            }else if (mins-(mins/60)*60 >=15 && mins-(mins/60)*60 <31){
                fee = 30*(mins/60)+15;
            }else{
                fee = 30*(mins/60)+30;
            }
            System.out.println("Fee:"+fee);
            //3:14 => NTD$90 , 3:15 => NTD$120
            //3:15-3:30 => NTD$105
        }catch (Exception e){
            System.out.println("Wrong format");
        }
    }
}
