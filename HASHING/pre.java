import java.util.*;

public class pre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute
        int[] hash = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Queries
        int q;
        q = sc.nextInt();

        while (q-- > 0) {

            int number;
            number = sc.nextInt();

            // Fetch
            System.out.println(hash[number]);
        }

        sc.close();


    }
    
}
