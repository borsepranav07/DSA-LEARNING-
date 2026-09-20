public class first_last_occurence {

    static int first(int[] arr, int n, int target) {

        int first = -1;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {

                first = mid;
                high = mid - 1;       // search left

            } 
            else if (arr[mid] < target) {

                low = mid + 1;        // search right

            } 
            else {

                high = mid - 1;       // search left
            }
        }

        return first;
    }


    static int last(int[] arr, int n, int target) {

        int last = -1;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {

                last = mid;
                low = mid + 1;        // search right

            } 
            else if (arr[mid] < target) {

                low = mid + 1;        // search right

            } 
            else {

                high = mid - 1;       // search left
            }
        }

        return last;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 8, 8, 8, 8, 34, 45, 56, 67, 78, 89};

        int n = arr.length;

        int target = 8;

        System.out.println("First occurrence: " + first(arr, n, target));
        System.out.println("Last occurrence: " + last(arr, n, target));
        

        
        // brute solution :
        int first= -1,last= -1;
        
        for(int i=0;i<n;i++) {
            
            if(arr[i] == target) {
                if(first == -1) {
                    first = i;
                    
                }
                last = i;
            }
        }
        
        
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);



    }


    


}