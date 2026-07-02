package day2;

import java.util.Scanner;
public class si {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("princple amount:");
        int p = sc.nextInt();
        System.out.println("Nmber of years:");
        int n = sc.nextInt();
        System.out.println("Rate of intrest:");
        int r = sc.nextInt();
        float a = p * n * r / 100;
        System.out.println("The simple intrest of the given values:"+a);


    }
}
