class Solution:
    def smallestPalindrome(self, s: str) -> str:
        n = len(s)
        chars = list(s)
        half = sorted(chars[:n//2])
        ans = half[:]
        if n % 2:
            ans.append(chars[n//2]) #with middle char

        ans.extend(reversed(half))

        return "".join(ans)
