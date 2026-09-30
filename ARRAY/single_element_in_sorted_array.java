public class single_element_in_sorted_array {

    static int LS(int[] arr, int n){

        if(n==1){
            return arr[0];
        }
        for(int i=0;i<n-1;i+=2) {

            if(arr[i] != arr[i+1]) {
                return arr[i];
            }

        }

        return arr[n-1];

    }

    static int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Correct pair
            if (nums[mid] == nums[mid + 1]) {
                // Single element is on the right
                low = mid + 2;
            } 
            else {
                // Single element is on the left
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};

        int n = arr.length;

        int ans = LS(arr,n);

        int Ans = singleNonDuplicate(arr);
        System.out.println(Ans);



        System.out.println(ans);

    }
    
}
