package day5;
import java.util.Scanner;
public class revarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size:");
        int a=sc.nextInt();
        System.out.println("Enter a array:");
        int[] arr=new int[a];
        for(int i=0;i<a;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=a-1;j>=0;j--){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            System.out.println(arr[i]);
        }
    }
}
