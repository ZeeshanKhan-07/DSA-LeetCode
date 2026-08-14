class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int i = 0;
        int j = 0;
        int n = s.length();
        int ans = 0;

        while (j < n) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);

            while (mp.get(s.charAt(j)) > 2) {
                char ch = s.charAt(i);
                mp.put(ch, mp.get(ch) - 1);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }
}