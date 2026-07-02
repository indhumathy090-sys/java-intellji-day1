package day10;
class calculator{
    int a;
    int b;
    public calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        int c=a+b;
        System.out.println("Add:"+c);
    }
    public void sub( ){
        int c=a-b;
        System.out.println("Subraction:"+c);
    }
}

public class oopscalculator {
    public static void main(String args[]){
        calculator cal1=new calculator(4,5);
        cal1.add();
        cal1.sub();
    }
}
