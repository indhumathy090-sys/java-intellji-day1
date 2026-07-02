package day10;
class num{
    private int a;
    private int b;
    public int getA(int a){
        return a;
    }
    public int getB(int b) {
        return b;
    }
    public void setA(int a){
        if(a>10){
            this.a=a;
        }else{
            System.out.println("Invalid input");
        }
    }
    public void setB(int b){
        this.b=b;
    }
    void display(){
        System.out.print(a + " " + b);
    }
}
public class encapulation {
    public static void main(String args[]){
        num a1=new num();
        a1.setA(10);
        a1.setB(20);
        a1.display();
    }
}
