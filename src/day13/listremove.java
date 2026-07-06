package day13;
import java.util.*;
public class listremove {
    public static void main(String args[]){
        List<String> name=new ArrayList<>();
        name.add("A");
        name.add("B");
        name.add("c");
        name.add("D");
        name.remove(2);
        name.remove("A");
        System.out.println(name);
    }
}
