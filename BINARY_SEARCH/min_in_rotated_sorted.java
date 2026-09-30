public class min_in_rotated_sorted {

    public static void main(String[] args) {
        
        int[] arr = {6,7,8,9,1,2,3,4,5};

        int n = arr.length;
        int min = arr[0];

        int low = 0;
        int high = n-1;

        while(low<=high) {
            int mid = (low+high)/2;

            if(arr[low]<=arr[high]) {
                min = Math.min(min,arr[low]);
                break;
            }

            if(arr[low]<=arr[mid]) {
                min = Math.min(min,arr[low]);
                low = mid+1;
                
            }else{
                min = Math.min(min,arr[mid]);
                high = mid-1;
            }
        }

        System.out.println(min);



    }
    
}
