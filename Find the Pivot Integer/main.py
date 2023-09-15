class Solution:
    def pivotInteger(self, n: int) -> int:
        s = sum(range(1, n + 1))
        s1 = 0
        for i in range(1, n + 1):
            s1 += i
            if 2 * s1 == s + i:
                return i
        return -1
