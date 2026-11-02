class Solution {
    public int minMoves2(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        for(int i = 0; i < nums.length / 2; i++) {
            moves += Math.abs(nums[i] - mid);
            moves += Math.abs(nums[nums.length - i - 1] - mid);
        }
        return moves;
    }
}