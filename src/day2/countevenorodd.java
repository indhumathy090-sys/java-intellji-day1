package day2;

import java.util.Scanner;
public class countevenorodd {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a digit");
        int a=sc.nextInt();
        int even=0;
        int odd=0;
        while(a!=0){
            int digit=a%10;
            if(a%2==0){
                even++;
            }
            else{
                odd++;
            }
            a=a/10;
        }
        System.out.println("Number of even digits:"+even);
        System.out.println("Number of odd digits:"+odd);
    }
}
