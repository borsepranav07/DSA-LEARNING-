public class maximum_consecutive_ones {

    public static void main(String[] args) {
        
        int[] arr ={1,2,3,4,3,2,1,1,1,1,22,3,31,1,1};

        int max = 0;
        int cnt = 0;

        int n = arr.length;

        for(int i=0;i<n;i++) {
            if(arr[i] == 1) {

                cnt +=1;
                max = Math.max(max,cnt);

            }else {
                cnt = 0;
            }


        }

        System.out.println(max);


    }
    
}
