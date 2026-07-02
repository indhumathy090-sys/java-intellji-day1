package day2;

import java.util.Scanner;
public class smallestdigi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=sc.nextInt();
        int small=9;
        while(a!=0){
            int digit=a%10;
            if(digit<small)
            {
                small=digit;
            }
            a=a/10;
        }
        System.out.println(small);
    }
}
