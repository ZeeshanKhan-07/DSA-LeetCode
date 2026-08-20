class Solution {
    public int[] resultArray(int[] nums) {
       List<Integer> arr1 = new ArrayList<>();
       List<Integer> arr2 = new ArrayList<>();

        int n = nums.length;
       
       arr1.add(nums[0]);
       arr2.add(nums[1]);

       int i = 2;
       while(i < n) {
        if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
            arr1.add(nums[i]);
        } else {
            arr2.add(nums[i]);
        }
        i++;
       }
       int[] ans = new int[n];
       int idx = 0;
       for(int num : arr1) {
        ans[idx] = num;
        idx++;
       }

       for(int num : arr2) {
        ans[idx] = num;
        idx++;
       }

       return ans;
    }
}