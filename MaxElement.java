public class java {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 10, 4};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max ele: " + max);
    }
}
