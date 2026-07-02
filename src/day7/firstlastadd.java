package day7;
import java.util.Scanner;
public class firstlastadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int last = num % 10;
        while (num >= 10) {
            num = num / 10;
            int first = num;
            int sum = first + last;
            System.out.println("First Digit = " + first);
            System.out.println("Last Digit = " + last);
            System.out.println("Sum = " + sum);

        }

    }
}

