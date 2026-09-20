public class QuickSort {


    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);

        for(int j=low;j<high;j++) {
            if(arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void QuickSort(int[] arr, int low, int high) {

        if(low<high) {
            int pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);


        }

    }


    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};

        int n = arr.length;

        QuickSort(arr, 0, n-1);


        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }


    }
    
}
