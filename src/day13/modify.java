package day13;
import java.util.*;
public class modify {
    public static void main(String args[]){
        List<String> a=new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        a.set(0,"aa");
        System.out.println(a);
        a.replaceAll(s -> s.toUpperCase());
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);
    }
}
