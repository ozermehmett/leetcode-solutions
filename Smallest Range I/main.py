class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        nums.sort()
        n = len(nums)

        min_score = nums[n - 1] - nums[0]
        min_score -= min(2 * k, min_score)

        return min_score
