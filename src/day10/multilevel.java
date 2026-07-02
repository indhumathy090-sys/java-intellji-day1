package day10;
class num1{
    void displayinfo(){
        System.out.println("hello");
    }
}
class num2 extends num1{
    void displayinfo(){
        System.out.println("world");
    }
}
class num3 extends num2{
    void displayinfo(){
    System.out.println("Indhu");
}}
public class multilevel {
    public static void main(String args[]){
        num1 na=new num1();
        num2 na2=new num2();
        num3 na3=new num3();
        na2.displayinfo();
    }
}
