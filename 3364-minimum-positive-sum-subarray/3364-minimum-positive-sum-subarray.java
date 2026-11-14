class Solution {
    public int minSum(List<Integer> nums, int size) {
        int j = size;
        int idx = 0;
        int min = Integer.MAX_VALUE;

        while (j <= nums.size()) {
            int sum = 0;

            for (int i = idx; i < j; i++) {
                sum += nums.get(i);
            }

            if (sum > 0) {
                min = Math.min(min, sum);
            }

            idx++;
            j++;
        }

        return min;
    }

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            ans = Math.min(ans, minSum(nums, k));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}