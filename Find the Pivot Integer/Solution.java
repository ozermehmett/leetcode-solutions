public class Solution {
    public int pivotInteger(int n) {
        int s = (n * (n + 1)) / 2;
        int s1 = 0;
        for (int i = 1; i <= n; i++) {
            s1 += i;
            if (2 * s1 == s + i) {
                return i;
            }
        }
        return -1;
    }
}
