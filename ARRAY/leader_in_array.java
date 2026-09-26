public class leader_in_array {

    public static void main(String[] args) {
        

        int[] arr = {10,22,12,3,0,6};

        int n = arr.length;

        //   brute force :

        
        for(int i=0;i<n;i++) {
            int leaders = 0;
            for(int j=i+1;j<n;j++) {

                if(arr[j] > arr[i]) {

                    leaders = 1;
                }

            }

            if (leaders == 0) {

                System.out.println(arr[i]);
                
            }
        }



        //  optimal :

        int maxi = -1;

        for(int i=n-1;i>=0;i--) {
            if(arr[i]>maxi) {
                System.out.print(arr[i] + "\n");
                maxi = arr[i];
            }
        }
    }
    
}
