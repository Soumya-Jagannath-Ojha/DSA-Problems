import java.util.HashSet;

public class DistinctInt {

    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            set.add(nums[j]);
        }

        // Reverse the digit
        for (int i = 0; i < nums.length; i++) {
            int reverse = 0;
            while (nums[i] != 0) {
                int digit = nums[i] % 10;
                reverse = reverse * 10 + digit;
                nums[i] /= 10;
            }
            set.add(reverse);
        }

        return set.size();

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2 };
        System.out.println(countDistinctIntegers(arr));
    }
}
