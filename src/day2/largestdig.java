package day2;

import java.util.Scanner;
public class largestdig {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=sc.nextInt();
        int large=0;
        while(a!=0){
            int digit=a%10;
            if(digit>large)
            {
                large=digit;
            }
            a=a/10;
        }
        System.out.println(large);
    }
}
