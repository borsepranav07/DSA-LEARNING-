import java.util.*;

public class pascal_triangle {

    public static void main(String[] args) {

        int numsrow = 5;

        int n = numsrow;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {

                    row.add(1);

                } else {

                    int value = ans.get(i - 1).get(j - 1)
                              + ans.get(i - 1).get(j);

                    row.add(value);
                }
            }

            ans.add(row);
        }

        System.out.println(ans);
    }
}