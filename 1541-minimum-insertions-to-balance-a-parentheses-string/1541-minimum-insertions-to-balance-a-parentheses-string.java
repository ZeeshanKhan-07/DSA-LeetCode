class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;
        int ans= 0;
        int i = 0;
        while(i < n) {
            if(s.charAt(i) == '(') {
                count++;
                i++;
            } else { // ')'
                if(count > 0) { //we had opening braces;
                    count--;
                } else {
                    //append one '('
                    ans++;
                }

                if(i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2; //found '))'
                } else {
                    ans++; //append ')'
                    i++;
                }
            }
        }
        return ans + 2 * count;
    }
}