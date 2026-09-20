class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int idx = 1;
        for(char ch : s.toCharArray()) {
            int val = 'z' - ch + 1;
            sum += val * idx;
            idx++;
        }

        return sum;
    }
}