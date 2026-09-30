public class how_many_times_array_rotated {

    public static void main(String[] args) {
        
        int[] arr = {6,7,8,9,1,2,3,4,5};

        int n = arr.length;
        int min = arr[0];

        int low = 0;
        int high = n-1;
        int index = -1;
        

        while(low<=high) {
            int mid = (low+high)/2;

            if(arr[low]<=arr[high]) {
                if(arr[low]<min) {
                    index = low;
                    min = arr[low];
                }
                break;
            }

            if(arr[low]<=arr[mid]) {
                if(arr[low]<min) {
                    index = low;
                    min = arr[low];
                }
                low = mid+1;
                
            }else{
                if(arr[mid]<min) {
                    index = mid;
                    min = arr[mid];
                }
                high = mid-1;
            }
        }

        System.out.println(min);
        System.out.println(index);



    }
    
    
}
