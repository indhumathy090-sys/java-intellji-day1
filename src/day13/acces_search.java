package day13;
import java.util.*;
public class acces_search {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        List<String> n1=new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        String n =n1.get(0);
        System.out.println(n);
        int a=n1.indexOf("A");
        System.out.println(a);
        int b=n1.lastIndexOf("F");
        System.out.println(b);
       String str=sc.nextLine();
        boolean a1=n1.contains(str);
        System.out.println(a1);
        boolean a2=n1.isEmpty();
        System.out.println(a2);
        int size=n1.size();
        System.out.println(size);
    }
}
