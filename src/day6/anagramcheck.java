package day6;
import java.util.Scanner;
import java.util.Arrays;
public class anagramcheck {
    public static void main(String args[]){
        String s = new String("hello");
        String s1 = new String("Hello");
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        if(s.length()!=s1.length()){
            System.out.println("false");
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = s1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println(true);
        }
        else{
            System.out.println( false);
        }
    }
}
