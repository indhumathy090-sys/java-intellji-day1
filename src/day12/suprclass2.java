package day12;
class A1{
    void dispay(){
        System.out.println("Hello world");
    }
}
class B1 extends A1{
    void display(){
        super.dispay();
        System.out.println("Hello hii");
    }
}
public class suprclass2 {
    public static void main(String aegs[]){
        B1 b=new B1();
        b.display();
    }
}
