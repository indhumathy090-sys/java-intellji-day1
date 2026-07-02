package day3;

import java.util.Scanner;
public class productdigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int product=1;
        while(a!=0){
            int pop=a%10;
            product*=pop;
            a/=10;
        }
        System.out.println(product);
    }
}
