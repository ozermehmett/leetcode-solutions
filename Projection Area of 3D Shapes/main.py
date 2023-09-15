class Solution:
    def projectionArea(self, grid: List[List[int]]) -> int:
        n = len(grid)
        xy = 0
        xz = 0
        yz = 0

        for i in range(n):
            max_row = 0
            max_col = 0
            for j in range(n):
                if grid[i][j]:
                    xy += 1
                max_row = max(max_row, grid[i][j])
                max_col = max(max_col, grid[j][i])
            yz += max_row
            xz += max_col
        return xy + xz + yz

