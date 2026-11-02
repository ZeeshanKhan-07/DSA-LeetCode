class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()
        n = len(nums)
        mid = nums[len(nums) // 2]
        moves = 0
        for i in range(0, n):
            moves += abs(nums[i] - mid)
        return moves
