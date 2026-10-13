class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        long first = 0;
        long last = 0;

        for(int i = 0; i < nums.length / 2; i++) {
            last += nums[i];
        }

        for(int i = nums.length / 2; i < nums.length; i++) {
            first += nums[i];
        }

        return first - last;

    }
}