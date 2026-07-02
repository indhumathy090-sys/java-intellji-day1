package day11;
abstract class a2{
    abstract void run();
    abstract void display();
}
class d extends a2{
    void display(){
        System.out.println("Hello");
    }
    void run(){
        System.out.println("Dudu");
    }
}
public class abstraction {
    public static void main(String args[]){
        d a7=new d();
        a7.run();
        a7.display();
    }
}
