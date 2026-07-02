package day6;
import java.util.Scanner;
public class stringvowles {
    public static void main(String args[]){
        String s = new String("Hello");
        String s2=s.toLowerCase();
        char[] arr = s2.toCharArray();
        int cont=0;
        int vow=0;
        for(char num:arr){
            if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u'){
                vow++;
            }else{
                cont++;
            }
        }
        System.out.println(vow);
        System.out.println(cont);
    }
}
