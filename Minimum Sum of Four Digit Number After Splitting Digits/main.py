class Solution:
    def minimumSum(self, num: int) -> int:
        arr = list(str(num))
        arr.sort()
        a = int(arr[0]+arr[2])+int(arr[1]+arr[3])
        return a
