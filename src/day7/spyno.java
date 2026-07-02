package day7;
import java.util.Scanner;
public class spyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        int sum = a + b + c;
        int product = a * b * c;
        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");

    }
}
