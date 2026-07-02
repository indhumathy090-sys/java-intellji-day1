package day4;

import java.util.Scanner;
public class patternprint {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a digit:");
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=a;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        }

}
