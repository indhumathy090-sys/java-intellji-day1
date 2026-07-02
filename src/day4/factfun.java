package day4;

import java.util.Scanner;
public class factfun {
    public static void main(String args[]){
        fact();
    }
    static void fact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int fa=1;
        for(int i=1;i<=n;i++){
            fa*=i;
        }
        System.out.println(fa);
    }
}
