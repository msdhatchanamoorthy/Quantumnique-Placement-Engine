import java.util.Arrays;

public class java {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 7 };
        Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];

        System.out.println("Second Largest: " + secondLargest);
    }
}
