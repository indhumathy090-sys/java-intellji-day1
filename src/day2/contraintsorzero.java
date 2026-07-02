package day2;

import java.util.Scanner;

public class contraintsorzero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int n=a;
        boolean found=false;
        while(n!=0){
            int digit=n%10;
            if (digit == 0) {
                found = true;
                break;
            }
            n=n/10;
        }
        if(found){
            System.out.println("The given digits contains zero");
        }else{
            System.out.println("The given digits not contains zero");
        }
    }
}
