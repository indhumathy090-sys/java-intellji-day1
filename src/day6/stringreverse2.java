package day6;

public class stringreverse2 {
    public static void main(String args[]) {
        String s = new String("Hello world");
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.println(arr);
    }
}
