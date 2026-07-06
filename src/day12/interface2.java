package day12;
abstract class Animals{
    abstract void eat();
}
class dog1 extends Animals{
    void eat(){
        System.out.println("Dog is eating ");
    }
}
interface pet{
    void eat();
}
class cow extends Animals implements pet{
    public void eat(){
        System.out.println("cow is eating");
    }
}
public class interface2 {
    public static void main(String args[]){
        Animals a=new dog1();
        a.eat();
        Animals b=new cow();
        b.eat();
    }
}