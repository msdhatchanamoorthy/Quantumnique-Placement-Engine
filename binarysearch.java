class SimpleSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25, 30, 35 };
        int target = 25;

        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Index is: " + result);
    }
}