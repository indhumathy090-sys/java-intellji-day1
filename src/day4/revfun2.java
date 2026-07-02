package day4;

import java.util.Scanner;
public class revfun2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        rev(n);
    }
    static void rev(int n){
        int rev=0;
        while(n!=0)
        {
            int pop=n%10;
            n=n/10;
            rev=rev*10+pop;
        }
        System.out.println(rev);
    }
}

