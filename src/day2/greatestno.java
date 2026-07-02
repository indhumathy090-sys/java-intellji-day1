package day2;

import java.util.Scanner;
public class greatestno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int a = sc.nextInt();
        System.out.println("Enter the Number2:");
        int b = sc.nextInt();
        System.out.println("Enter the Number3:");
        int c = sc.nextInt();
        if (a>=b&&a>=c) {
            System.out.println("A is gratest");
        }else if (b>=a&&b>=c){
            System.out.println("B is gratest");
        }
        else {
            System.out.println("C is greatest");
        }

    }
}
