public class search_in_rotated_sorted_array_2 {

    public static void main(String[] args) {

        int[] arr = {5, 34, 67, 78, 97, 200, 1, 2, 3, 4};

        int n = arr.length;

        int target = 67;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return;
            }

            // Duplicates case
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {

                // Target lies in left sorted half
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }

                // Target lies in right half
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in right sorted half
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }

                // Target lies in left half
                else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Target not found");
    }
}