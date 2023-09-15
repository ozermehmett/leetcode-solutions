class Solution:
    def countDigits(self, num: int) -> int:
        count = 0
        num_str = str(num)
        for i in num_str:
            if num % int(i) == 0:
                count += 1
        return count
