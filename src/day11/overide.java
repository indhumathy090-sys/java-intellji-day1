package day11;
class a1{
    void dsiplay(){
        System.out.println("Display");
    }
}
class b1 extends a1{
    void dsiplay(){
        System.out.println("Hello");
    }
}
public class overide {
    public static void main(String args[]){
        b1 b2=new b1();
        b2.dsiplay();
    }
}
