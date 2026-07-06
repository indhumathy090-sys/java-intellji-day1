package day12;
abstract class computer{
    abstract void display();
}
class laptop extends computer{
    void display(){
        System.out.println("laptop");
    }
}
class desktop extends computer{
    void display(){
        System.out.println("Desktop");
    }
}
public class abstract2 {
    public static void main(String args[]){
computer sc=new laptop();
computer sc1=new desktop();
sc.display();
sc1.display();
}
}