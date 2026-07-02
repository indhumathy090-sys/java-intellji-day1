package day5;
import java.util.Scanner;
public class arrayadd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }
    }

}
