class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, set it to 0 and carry over
            digits[i] = 0;
        }
        
        // If we get here, it means all digits were 9s (e.g., [9, 9, 9])
        // We need a new array of size n + 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }
}