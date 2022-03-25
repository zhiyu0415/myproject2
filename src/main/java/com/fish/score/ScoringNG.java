package com.fish.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name={"Tony","Tina","Andy","Anne","Hank"};
        int[] English={98,59,86,73,66};
        int[] Math={100,77,58,63,20};
        for (int i = 0; i < 5; i++) {
            if(i!=1){
                System.out.println(name[i]+"\t"+English[i]+"\t"+Math[i]+"\t"+(English[i]+Math[i])/2);
            }
        }
    }
}