public class PeakIndexInMountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 8, 9, 8, 7, 5, 3, 1};

        PeakIndexInMountainArray obj = new PeakIndexInMountainArray();

        int ans = obj.peakIndexInMountainArray(arr);

        System.out.println("Peak Index = " + ans);
        System.out.println("Peak Element = " + arr[ans]);
    }

    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}