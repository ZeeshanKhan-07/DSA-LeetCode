class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
           for (int missing = nums[i] + 1; missing < nums[i + 1]; missing++) {
                list.add(missing);
            }
        }
        return list;
    }
}