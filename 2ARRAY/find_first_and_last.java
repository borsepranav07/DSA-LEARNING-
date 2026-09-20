import java.util.Arrays;

public class find_first_and_last {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        find_first_and_last obj = new find_first_and_last();
        int[] ans = obj.searchRange(nums, target);

        System.out.println(Arrays.toString(ans));
    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        int start = searchindex(nums, target, true);
        int end = searchindex(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public int searchindex(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;    // Search left half
                } else {
                    start = mid + 1;  // Search right half
                }
            }
        }

        return ans;
    }
}