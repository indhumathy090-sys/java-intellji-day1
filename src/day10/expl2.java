package day10;
import java.util.Scanner;
class eg{
    int a;
    int b;
    public void main(){
        int a=10;
        int b=50;
        System.out.println(a+b);
    }
}
public class expl2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        eg obj=new eg();
        obj.a=sc.nextInt();
        obj.b=sc.nextInt();
        obj.main();

    }
}
