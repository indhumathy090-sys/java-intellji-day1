package day10;
class car{
    void displayinfo(){
        System.out.println("Hello");
    }
}
class car2 extends car{
    void displayinfo(){
        System.out.println("World");
    }
}
class car3 extends car{
    void displayinfo(){
        System.out.println("indhu");
    }
}
public class multiple {
    public static void main(String args[]){
        car ca=new car();
        car2 ca2=new car2();
        car3 ca3=new car3();
        ca3.displayinfo();
    }}
