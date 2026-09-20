public class search_insert_position {


    static int binarysearch( int target, int[] arr) {

        int n = arr.length;

        int ans = n;

        int start = 0;
        int end = n-1;

        while(start<=end) {
            int mid = (start+end)/2;

            if(arr[mid]>= target) {
                ans = mid;
                end = mid-1;
            }
            else 
                start = mid+1;
        }

        return ans;

    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,6,7,7,8,9};
        
        int target = 23123333;


        int res = binarysearch(target,arr);

        System.out.println(res);




    }
}
