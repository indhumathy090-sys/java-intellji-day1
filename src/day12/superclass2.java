package day12;
class indhu{
    String name="Indhu";
    void display(){
        System.out.println("Hello");
    }
}
class swetha extends indhu{
    void display(){
        super.display();
        System.out.println("Hii");
        System.out.println(super.name);
    }
}
public class superclass2 {
    public static void main(String args[]){
        swetha sw=new swetha();
        sw.display();
    }
}
