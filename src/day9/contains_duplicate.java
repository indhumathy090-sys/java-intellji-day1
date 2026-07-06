import java.util.Arrays;
import java.util.Scanner;
class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        contains_duplicate obj = new contains_duplicate();
        boolean result = obj.containsDuplicate(nums);
        if (result) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }

    }
}
