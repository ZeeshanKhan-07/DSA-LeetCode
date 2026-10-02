class Solution {
    public boolean isValid(String str) {
        int count = 0;
        for(char ch : str.toCharArray()) {
            if(ch == '(') {
                count++;
            } else {
                count--;

                if(count < 0) { //if the count ever becomes negative then just return false
                    return false;
                }
            }
        }
        return count == 0;
    }
    public void generate(String curr, int n, int length, List<String> ans) {
        //base case 
        if(length == 2 * n) { //length == length of the curr string
            if(isValid(curr)) {
                ans.add(curr);
            }
            return;
        }

        curr += '(';
        generate(curr, n, length + 1, ans);
        curr = curr.substring(0, curr.length() - 1); //remove the last character

        curr += ')';
        generate(curr, n, length + 1, ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate("", n, 0, ans);
        return ans;
    }
}