package day10;
import java.util.Scanner;
class bank{
    private int a;
    public int getA() {
        return a;
    }
    public void setA(int a){
        if(a>0)
        {
            this.a=a;
        }
        else
        {
            System.out.println("invalid input");
        }
    }
    void display(){
        System.out.println("Bank balance:"+a);
    }
}
public class bankbalance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        bank a1=new bank();
        a1.setA(a);
        a1.display();

    }
}
