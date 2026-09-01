class Solution:
    def isPalindrome(self, s: str) -> bool:
        filtered = "".join(char.lower() for char in s if char.isalnum())
        
        def check(start, end):
            #Base case
            if start >= end:
                return True

            if filtered[start] != filtered[end]:
                return False
            return check(start + 1, end - 1)
        return check(0, len(filtered) - 1)