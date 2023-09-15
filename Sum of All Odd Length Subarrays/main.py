class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        result = 0
        n = len(arr)

        for i in range(n):
            for j in range(i, n, 2):
                result += sum(arr[i:j + 1])

        return result
    