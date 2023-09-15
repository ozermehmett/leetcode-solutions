class Solution {
    public int projectionArea(int[][] grid) {
        int xy = 0;
        int xz = 0;
        int yz = 0;

        for(int i = 0; i < grid.length; i++){
            int maxRow = 0;
            int maxCol = 0;
            for(int j = 0; j < grid.length; j++){
                if (grid[i][j] > 0){
                    xy++;
                }
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            yz += maxRow;
            xz += maxCol;
        }
        return xy + xz + yz;
    }
}