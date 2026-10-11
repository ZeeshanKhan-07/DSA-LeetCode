class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int idx = i + 1;
            if(nums.length % idx == 0) {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}