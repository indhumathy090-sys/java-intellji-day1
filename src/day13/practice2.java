package day13;
import java.util.*;
public class practice2 {
    public static void main(String args[]){
        List<String> a=new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        a.add("G");
        a.add("H");
        a.addFirst("I");
        a.addLast("j");
        List<String> a1=new ArrayList<>(Arrays.asList("hi"));
        a.addAll(a1);
        System.out.println("Add Method");
        System.out.println(a);
        System.out.println("Remove Method");
        a.remove(0);
        System.out.println(a);
        a.remove("E");
        System.out.println(a);
        a.removeAll(a);
        System.out.println(a);
        System.out.println("Access method");
//        String n =a.get(3);
//        System.out.println(n);
        int a7=a.indexOf("A");
        System.out.println(a7);
        int b=a.lastIndexOf("F");
        System.out.println(b);
    }
}
