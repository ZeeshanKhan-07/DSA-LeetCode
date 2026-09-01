class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)

        for i in range(n - 1, -1, -1):

            # If digit is less than 9, just add 1 and return
            if digits[i] < 9:
                digits[i] += 1
                return digits

            # If digit is 9, make it 0 and carry 1
            digits[i] = 0

        # All digits were 9
        return [1] + [0] * n