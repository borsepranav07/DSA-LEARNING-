
public class lower_bound {



    static int lower_boundbs(int[] arr, int target , int n) {
        int start = 0;
        int end = n-1;

        int ans = n;

        while(start<=end) {
            int mid =(start+end)/2;

            if(target<=arr[mid]) {
                ans = mid;

                end = mid-1;
            }

            else start = mid+1;
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,6,7,8,99,100};

        int n = 11;

        int target = 23;


        int result = lower_boundbs(arr,target,n);

        System.out.println(result);

        
    }

    
}
