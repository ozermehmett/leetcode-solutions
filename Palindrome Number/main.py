class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        l = list((str(x)))
        t = l[::-1]
        e = int(''.join(map(str, t)))
        if e == x:
            return True
        else:
            return False