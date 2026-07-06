package day12;
import java.util.*;
import java.util.ArrayList;
class student{
    private String name;
    private int age;
    private int id;
    student(){

    }
    public student(String name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age + ", ID = " + id;
    }
}
public class arraylist2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<student> stud = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            stud.add(new student(name, age, id));
        }

        System.out.println(stud);

        sc.close();
    }
}
