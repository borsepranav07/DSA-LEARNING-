public class count_rotation {

    public static int rotationCount(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int count = rotationCount(nums);

        System.out.println("Rotation count: " + count);
    }
}
