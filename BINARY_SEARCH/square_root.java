public class square_root {
    public static void main(String[] args) {
        
        int n = 26;

        /* 
        int ans = 1;
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans = i;
            }else{
                break;
            }
        }

        System.out.println(ans);
        
        */

        int low =0;
        int high = n;
        int Ans = 0;
        
        while(low<=high) {
            
            int mid = (low+high)/2;
            
            if(mid*mid<=n) {
                Ans = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(Ans);
    }

    
    
}
