class Solution:
    def isPalindrome(self, s: str) -> bool:
        filtered = "".join(char.lower() for char in s if char.isalnum())
        start = 0
        end = len(filtered) - 1
        while start < end:
            if filtered[start] != filtered[end]:
                return False
            start = start + 1
            end = end - 1
        
        return True