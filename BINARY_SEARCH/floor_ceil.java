public class floor_ceil {


    static void floor(int[] arr, int target) {
        int n = arr.length;

        int ans = -1;

        int start = 0;
        int end = n-1;

        while(start<=end) {
            int mid = (start+end)/2;

            if(target>=arr[mid]) {

                ans = arr[mid];
                start = mid+1;
            }

            else end = mid-1;


        }

        System.out.println(ans);



    }


    static void ceil(int[] arr, int target) {

        int n = arr.length;

        int ans = -1;

        int start = 0;

        int end = n-1;

        while(start<=end) {
            
            int mid = (start+end)/2;

            if(target<=arr[mid]) {
                ans = arr[mid];
                end = mid-1;

            }

            else start = mid+1;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};

        int target = 4;

        floor(arr,target);
        ceil(arr,target);

    }
    
}
