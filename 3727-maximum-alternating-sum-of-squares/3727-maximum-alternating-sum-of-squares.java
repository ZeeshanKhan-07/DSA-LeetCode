class Solution {
    public long maxAlternatingSum(int[] nums) {
        //a2 - b2 + c2 - d2 + e2 is same as a2 + c2 + e2 (should be maxm)- (b2 + d2 (should be minm))
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