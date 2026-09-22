public class count_n {
    
    
    static int count(int num, int n, int[] arr) {

        int cnt = 0;

        for(int i=0;i<n;i++) {
            if(arr[i] == num) {
                cnt =  cnt +1;
            } 
        }

        return cnt;

    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,};

        int num = 4;

        int n = arr.length;

        System.out.println(count(num,n,arr));


    }

    
    
}
