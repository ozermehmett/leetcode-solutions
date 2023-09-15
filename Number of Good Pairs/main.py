class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = 0
        num_freq = {}

        for num in nums:
            if num in num_freq:
                count += num_freq[num]
                num_freq[num] += 1
            else:
                num_freq[num] = 1

        return count
    