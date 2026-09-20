import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

        // 1. for loop
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // 2. while loop

        int i = 1;

        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        // 3. do-while loop
        int j = 1;

        do {
            System.out.println(j);
            j++;
        }
        while(j <= 5);


        //  find largest of 3 numbers
        Scanner in = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = in.nextInt();
        System.out.println("enter second number : ");
        int b = in.nextInt();
        System.out.println("enter third number : ");
        int c = in.nextInt();

        int max = a;
        if(b> max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }

        System.out.println("the maximum number is : " + max);
        
        if (a>b) {
            max = a;
        } else {
            max = b;
        }
        
        if(c>max) {
            max = c;
        }
        
        System.out.println("the maximum number is : " + max);






        int maxx = Math.max(2, Math.max(1,9));
        System.err.println(maxx);




        // case check :
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        System.out.println(in.next().trim());

        //  fibonnaci series :
        int n = in.nextInt();
        int p = 0;
        int q = 1;
        int count = 2;

        while (count <= n) {
            int temp = q;
            q = q + p;
            p = temp;
            count++;

        }

        System.out.println(q);




        // counting occurences

        int v = in.nextInt();

        int Count = 0;

        while(v>0) {
            int rem = v % 10;
            if(rem == 5) {
                Count++;
            }
            v = v / 10;
        }
        System.out.println(Count);




        //  reverse number :
        int NUMM = 1234567890;
        int ANS = 0;
        while(NUMM>0) {
            int rem = NUMM % 10;
            NUMM = NUMM / 10;
            ANS = ANS*10 + rem;

        }

        System.out.println(ANS);





    }
    
}
