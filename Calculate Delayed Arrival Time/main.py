class Solution:
    def findDelayedArrivalTime(self, arrivalTime: int, delayedTime: int) -> int:
        n = arrivalTime + delayedTime
        if n >= 24:
            return n - 24
        else:
            return n
