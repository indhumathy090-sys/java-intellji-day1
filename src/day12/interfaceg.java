package day12;
interface animal{
    void sound();
    void sleep();
}
class dog implements animal{
    public void sound(){
        System.out.println("dog bow bow");
    }
    public void sleep(){
        System.out.println("dog is sleeping");
    }
}
class cat implements animal{
    public void sound(){
        System.out.println("cat meow");
    }
    public void sleep(){
        System.out.println("cat is sleeping");
    }
}

public class interfaceg {
    public static void main(String args[]){
        animal a1=new dog();
        animal a2=new cat();
        a1.sound();
        a1.sleep();
        a2.sound();
        a2.sleep();
    }
}
