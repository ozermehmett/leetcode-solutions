class Solution:
    def addDigits(self, num: int) -> int:
        num_str = str(num)
        total = 0
        if len(num_str) <= 1:
            return num
        while len(num_str) > 1:
            total = 0
            for i in num_str:
                total += int(i)
            num_str = str(total)

        return total
