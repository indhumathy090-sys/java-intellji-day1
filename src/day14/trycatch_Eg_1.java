package day14;
import java.util.Scanner;
public class trycatch_Eg_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=0;
        try{
            n=sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        System.out.println(n);
    }
}
