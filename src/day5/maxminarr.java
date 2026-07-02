package day5;
import java.util.Scanner;
public class maxminarr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size:");
        int a=sc.nextInt();
        System.out.println("Enter a array:");
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<a;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
