package home.practice;

public class level {
    String name;
    int C;
    int E;
    int M;
    public level(String name,int C,int E,int M){
        this.name = name;
        this.C = C;
        this.M = M;
        this.E = E;
    }
    public int average(){
       return (C+E+M)/3;
    }
    public void print(){
        System.out.print(name+"\t"+C+"\t"+E+"\t"+M+"\t"+average()+"\t");
        if(average() >= 90){
            System.out.println("A");
        }else if (average() >=80){
            System.out.println("B");
        }else if (average() >=70){
            System.out.println("C");
        } else if (average() >=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
