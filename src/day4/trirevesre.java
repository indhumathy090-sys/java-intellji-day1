package day4;

import java.util.Scanner;
public class trirevesre {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit:");
        int a = sc.nextInt();
        for (int i = a; i >=1 ; i--) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


