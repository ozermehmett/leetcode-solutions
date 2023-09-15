class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        total1 = sum(nums)
        total2 = 0
        for num in nums:
            num_str = str(num)
            for s in num_str:
                total2 += int(s)
        return abs(total1 - total2)
