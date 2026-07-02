package day3;

import java.util.Scanner;
public class reverse {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int num=a%10;
        a=a/10;
        int tense;
        tense=a%10;
        a=a/10;
        int d=a%10;
        int hundered=a;
        int b=(num*100)+(tense*10)+d;
            System.out.println(b);
    }
}
