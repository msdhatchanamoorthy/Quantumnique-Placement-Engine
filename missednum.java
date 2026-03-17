public class java {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int sum = 0;
        for (int i = 1; i <= 8; i++) {
            sum += i;
        }
        for (int num : arr) {
            sum -= num;
        }

        System.out.println("Missed num" + sum);
    }
}
