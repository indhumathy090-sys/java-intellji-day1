package day6;
import java.util.Scanner;
import java.util.Arrays;
public class annagram2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(Anagram(s,s2));
    }
    public static boolean Anagram(String s,String s2){
        if(s.length()!=s2.length()){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
