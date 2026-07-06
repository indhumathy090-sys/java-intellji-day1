import java.util.Scanner;

class reverse_intger2 {

    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;

            // Check for overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            // Check for underflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
            x = x / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        // Create object
        reverse_intger2 obj = new reverse_intger2();

        // Reverse the integer
        int result = obj.reverse(x);

        // Output
        System.out.println("Reversed Integer: " + result);

        sc.close();
    }
}