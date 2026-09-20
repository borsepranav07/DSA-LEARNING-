public class x_pow_n {


    public static int calcPower(int x, int n) {
        if(n == 0) {
            return 1;
        }     
        if(x == 0) {
            return 0;
        } 
        
        int xpowernm1 = calcPower(x , n-1);

        int xPowen = x*xpowernm1;

        return xPowen;
    }




    public static void main(String[] args) {
        int x=2, n=5;

        int ans = calcPower(x,n);

        System.out.println(ans);
    }
    
}
