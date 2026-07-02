package day6;
import java.util.Scanner;
public class lonestwordinstring {
    public static void main(String args[]){
        String s = new String("Largest word in the string");
        String largest="";
        String[] words=s.split(" ");
        for(String num:words){
            if (num.length() > largest.length()) {
                largest = num;
            }
        }
        System.out.println(largest);

    }
}
