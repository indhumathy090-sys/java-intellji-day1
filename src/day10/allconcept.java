package day10;import java.util.Scanner;
class Student {
    String name;
    int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
    }
}
class Mentor {
    String name;
    String dept;
    Student s;
    public Mentor(String name, String dept, Student s) {
        this.name = name;
        this.dept = dept;
        this.s = s;
    }
    void display() {
        System.out.println("Mentor Name  : " + name);
        System.out.println("Department   : " + dept);
        System.out.println("Student Details");
        s.display();
    }
}
class HOD {
    String name;
    Mentor m;
    public HOD(String name, Mentor m) {
        this.name = name;
        this.m = m;
    }
    void display() {
        System.out.println("HOD Name     : " + name);
        System.out.println(" Mentor Details");
        m.display();
    }
}
public class allconcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();
        System.out.print("Enter Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Mentor Name: ");
        String mname = sc.nextLine();
        System.out.print("Enter Mentor Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter HOD Name: ");
        String hname = sc.nextLine();
        Student s = new Student(sname, sid);
        Mentor m = new Mentor(mname, dept, s);
        HOD h = new HOD(hname, m);
        System.out.println(" HOD DISPLAY ");
        h.display();
        System.out.println(" MENTOR DISPLAY ");
        m.display();
    }
}

