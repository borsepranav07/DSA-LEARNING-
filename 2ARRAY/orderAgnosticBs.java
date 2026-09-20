public class orderAgnosticBs {

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 23, 34, 35, 56, 67};
        int[] arr = {98,78,76,56,54,43,23,21};
        int target = 23;

        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}