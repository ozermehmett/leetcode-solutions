class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        num_str = str(n)
        x = 1
        y = 0
        for i in num_str:
            x *= int(i)
            y += int(i)
        return x - y
