package day2;

import java.util.Scanner;
public class reverno {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int a = sc.nextInt();
        int rev=0;
        int org=a;
        while(a!=0)
        {
               int pop=a%10;
               a=a/10;
               rev=rev*10+pop;
        }
        System.out.println(rev==org);
    }

}
