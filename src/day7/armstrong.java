package day7;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int original = num;
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int c = num % 10;
        int sum = (a * a * a) + (b * b * b) + (c * c * c);
        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}

