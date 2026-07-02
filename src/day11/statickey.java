package day11;
class dd{
    public static int add(int a,int b){
        return a+b;
    }
}
public class statickey {
    public static void main(String args[]){
        int add2=dd.add(1,3);
        System.out.println(add2);
    }
}
