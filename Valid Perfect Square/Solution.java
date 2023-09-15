class Solution {
    public boolean isPerfectSquare(int num) {
        if (num <= 0) {
            return false;
        }

        if (num >= Math.pow(2, 31)) {
            return false;
        }

        int t = 1;
        while (t <= num / t) {
            if (t * t == num) {
                return true;
            }
            t += 1;
        }
        return false;
    }
}
