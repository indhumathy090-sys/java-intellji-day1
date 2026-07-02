package day11;
class a{
    a(){
        System.out.println("A");
    }
    a(int a){
        System.out.println("A is b");
    }
}
class b extends a{
    b(){
        super(5);
        System.out.println("B");
    }
    b(int a){
        this();
        System.out.println("B is A");
    }
}
public class suprclass {
    public static void main(String args[]){
        b bp=new b(5);
    }
}
