class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int seq = nums[0];
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] == nums[j - 1] + 1) {
                seq += nums[j];
            } else {
                break;
            }
        }

        while(set.contains(seq)) {
            seq++;
        }

        return seq;
    }
}