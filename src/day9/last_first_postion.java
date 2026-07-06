package day9;
import java.util.Scanner;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binary(nums, target, true);
        int last = binary(nums, target, false);
        return new int[]{first, last};
    }
    public int binary(int[] nums, int target, boolean first) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        Solution obj = new Solution();
        int[] result = obj.searchRange(nums, target);

        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }
}
