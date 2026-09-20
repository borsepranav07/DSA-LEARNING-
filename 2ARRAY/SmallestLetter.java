public class SmallestLetter {

    public static void main(String[] args) {

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char target = 'c';

        char ans = nextGreatestLetters(letters, target);

        System.out.println("Next greatest letter: " + ans);
    }

    public static char nextGreatestLetters(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Wrap around if target is greater than or equal to the last letter
        return letters[start % letters.length];
    }
}