class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int changesMade = 0;
        char prev = s.charAt(0);
        int currCount = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == prev) {
                currCount += 1;
                continue;
            }

            //if the chars are not same then we have to make the change 
            if(currCount % 2 == 0) { //Means we had an even length substring so we can cut it
                currCount = 1;
            } else {
                //we have to convert the char
                changesMade += 1;
                currCount = 0;
            }

            prev = s.charAt(i);
        }

        return changesMade;
    }
}