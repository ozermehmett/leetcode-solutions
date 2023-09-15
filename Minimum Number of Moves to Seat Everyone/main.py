class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        students.sort()
        seats.sort()
        move = 0
        for i in range(len(students)):
            if students[i] != seats[i]:
                move += abs(students[i] - seats[i])
        return move

