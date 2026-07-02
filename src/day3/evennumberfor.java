package day3;

import java.util.Scanner;
public class evennumberfor {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int a = sc.nextInt();
    for(int i=0;i<=a;i+=2)
    {
        System.out.println(i);
    }
}
}