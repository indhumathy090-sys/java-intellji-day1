package day12;
abstract class computer1{
    void display() {
        System.out.println("Hello");
    }
}
abstract class laptop2 extends computer1{
    void display(){
        super.display();
        System.out.println("hii");
    }
}
class vivo extends laptop2{

}
public class abstract4 {
    public static void main(String args[]){
        laptop2 sc=new vivo();
        sc.display();
    }
}
