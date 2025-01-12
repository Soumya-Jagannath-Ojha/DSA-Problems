import java.util.HashMap;

public class SubArrSum {
//Subarray Sum Equals to K 
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumj = new HashMap<>();
        sumj.put(0,1); //Default case

        int sum=0, ans=0;

        for(int j=0; j<nums.length; j++){
            sum += nums[j];
            if(sumj.containsKey(sum - k)){
                ans += sumj.get(sum - k);
            }
            sumj.put(sum, sumj.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {10,2,-2,-20,10};
        int k = -10;

        System.out.println("Subarray sum is equals to: "+subarraySum(nums, k));
    }
}
