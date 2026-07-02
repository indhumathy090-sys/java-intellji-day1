package day10;
class book1 {
    String name;
    String author;

    public book1(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public book1(String name) {
        this.name = name;
        this.author = "Null";
    }

    public book1() {
        this.name = "null";
        this.author = "null";
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Author:" + author);
    }
}
public class methodoverloading {
    public static void main(String args[]) {
        book1 a = new book1("gokul");
        a.display();
    }
}
