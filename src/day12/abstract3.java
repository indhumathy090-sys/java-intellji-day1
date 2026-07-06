package day12;
abstract class store{
    void display(){
        System.out.println("HEllo");
    }
}
class store2 extends store{
    void display(){
        super.display();
        System.out.println("hii");
    }
}
class store3 extends store2{
    void display(){
        System.out.println("Indhu");
    }
}
public class abstract3 {
    public static void main(String args[]){
        store a1=new store2();
        store a2=new store3();
        a1.display();
        a2.display();
    }
}
