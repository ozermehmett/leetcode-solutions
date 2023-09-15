class Solution {
    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        for (int w = width; w >= 1; w--){
            if ((area % w) == 0){
                return new int[] {(area/w), w};
            }
        }
        return new int[] {};
    }
}