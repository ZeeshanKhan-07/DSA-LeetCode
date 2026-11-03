class Solution:
    def minMoves(self, nums: List[int]) -> int:
        maxVal = max(nums)
        moves = 0
        for i in range(0, len(nums)):
            moves += maxVal - nums[i]
        return moves

        