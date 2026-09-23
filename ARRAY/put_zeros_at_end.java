public class put_zeros_at_end {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,0,0,7,5,0,8,7,0};
        int n= arr.length;

        int[] temp = new int[n];



        int j=0;
        for(int i=0;i<n;i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j+=1;
            }
        }


        for(int i=0;i<j;i++) {
            arr[i] = temp[i];
        } 

        for(int i=j;i<n;i++) {
            arr[i] = 0;
        }

        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
    
}
