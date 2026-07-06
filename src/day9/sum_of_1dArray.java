import java.util.Scanner;
class sum_of_1dArray {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
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
        sum_of_1dArray obj = new sum_of_1dArray();
        int[] result = obj.runningSum(nums);
        System.out.print("Running Sum: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
