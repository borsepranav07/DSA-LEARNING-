public class search_in_rotated_sorted_array {

    public static void main(String[] args) {
        
        int[] arr = {5,34,67,78,97,200,1,2,3,4};

        int n= arr.length;

        int target = 67;

        int low = 0;
        int high = n-1;

        while(low<=high) {
            int mid=(low+high)/2;

            if(arr[mid] == target) {
                System.out.println(mid); 
            }

            if(arr[low] <= arr[mid]) {
                if(target >= arr[low] && target<arr[mid]) {
                    high = mid-1;

                }
                else low = mid+1;
            }

            else {
                if(target >= arr[mid] && target <= arr[high]) {
                    low = mid+1;
                }
                else high = mid-1;
            }

        }



    }
}