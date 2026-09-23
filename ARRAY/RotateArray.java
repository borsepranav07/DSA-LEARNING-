/*public class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // If k is greater than n
        k = k % n;

        // Store last k elements
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Put temp elements at the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        rotate(nums, k);

        System.out.println("Array after rotation:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}*/

public class RotateArray {

    // Reverse elements from start to end
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle k greater than n
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        rotate(nums, k);

        System.out.println("Array after rotation:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}