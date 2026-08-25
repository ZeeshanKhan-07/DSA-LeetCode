class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums) {
            st.add(num);
        }

        int multiple = k;
        while(st.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}