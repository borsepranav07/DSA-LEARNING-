public class MergeSort {



    // Merge two sorted parts
    public static void merge(int arr[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];

        int i = low;       // Left part
        int j = mid + 1;   // Right part
        int k = 0;

        // Compare elements from both parts
        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right part
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    // Merge Sort
    public static void mergeSort(int arr[], int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {

        int arr[] = {38, 12, 27, 43, 9, 31, 18};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    

