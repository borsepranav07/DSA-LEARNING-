public class rearrange_by_sign {

    public static void main(String[] args) {
        /* 
        
        int[] arr = {1,-2,3,9,-8,-10,11,-12,13,-4,5,-6,7,-14,-18,-19,-34,45,67,56};
        
        int n=arr.length;
        
        // brute :
        
        int[] pos = new int[n/2];
        int po = 0;
        int[] neg = new int[n/2];
        int ne = 0;


        for(int i=0;i<n;i++) {

            if(arr[i] > 0) {
                pos[po] = arr[i];
                po++;
            }else{
                neg[ne] = arr[i];
                ne++;
            }
        }


        for(int i=0;i<n/2;i++) {

            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }

        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
       


        // better than brute :
        
        int[] arr2 = new int[n];
        
        int posi = 0;
        int nega = 1;
        
        
        
        
        
        
        for(int i=0;i<n;i++) {
            
            if(arr[i] >0) {
                arr2[posi] = arr[i];
                posi = posi + 2;
            }else{
                arr2[nega] = arr[i];
                nega = nega + 2;
            }
            
            
            
        }
        
        for(int i=0;i<n;i++) {
            System.out.println(arr2[i]);
        }





 */




        // diff varety :

        int[] arr = {1, 2, 3, 4, -5,23,67,12,-76,-34,-45,-30,-87,-18,-49,-23,-50,-81};

        int n = arr.length;

        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        // First put positives at even indexes
        // and negatives at odd indexes
        for (int x : arr) {

            if (x >= 0 && pos < n) {
                ans[pos] = x;
                pos += 2;
            }
            else if (x < 0 && neg < n) {
                ans[neg] = x;
                neg += 2;
            }
        }

        // Remaining elements
        for (int x : arr) {

            if (x >= 0 && pos >= n) {
                continue;
            }

            if (x >= 0 && ans[pos] == 0) {
                ans[pos] = x;
                pos++;
            }
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }

    }



    
}
