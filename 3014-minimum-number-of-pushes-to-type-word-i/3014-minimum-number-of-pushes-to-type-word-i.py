class Solution:
    def minimumPushes(self, word: str) -> int:
        n = len(word)
        ans = 0
        for i in range(0, n):
            ans = ans + (i // 8) + 1
        return ans   