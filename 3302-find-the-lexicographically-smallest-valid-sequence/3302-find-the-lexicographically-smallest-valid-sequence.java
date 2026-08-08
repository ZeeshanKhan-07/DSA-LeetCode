class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] rightHandMatchedCharsLength = new int[n];
        int i = n - 1;
        int j = m - 1;
        int rightSideMatchedCount = 0;
        while(i >= 0) {
            if(j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                rightSideMatchedCount++;
                j--;
            }
            rightHandMatchedCharsLength[i] = rightSideMatchedCount;
            i--;
        }

        int[] seq = new int[m];
        int idx = 0; //pointer for seq
        boolean changePower = true; //can change the power only once

        i = 0;
        j = 0;
        while(i < n && j < m) {
            //matched chars 
            if(word1.charAt(i) == word2.charAt(j)) {
                seq[idx++] = i;
                j++;
            } else if(changePower == true && i + 1 < n && rightHandMatchedCharsLength[i + 1] >= m - j - 1) {
                seq[idx++] = i;
                j++;
                changePower = false; //now we can't change the chars
            }
            i++;
        }

        return j == m ? seq : new int[0];
    }
}