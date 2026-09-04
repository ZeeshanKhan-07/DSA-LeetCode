class Solution {
    public int calculateScore(int nums[], int idx) {
        int max = nums[0];
        int min = nums[idx];

        for(int i = 0; i <= idx; i++) {
            max = Math.max(max, nums[i]);
        }

        for(int i = idx; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        return max - min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int score = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            int ins = calculateScore(nums, i);
            if(ins < score) {
                score = ins;
                index = i;
            }

            if(ins <= k) {
            return i;
            }
            
        }
        return -1;
    }
}