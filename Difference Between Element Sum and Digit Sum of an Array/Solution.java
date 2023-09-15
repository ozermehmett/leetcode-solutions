public class Solution {
    public int differenceOfSum(int[] nums) {
        int total1 = 0;
        int total2 = 0;

        for (int num : nums) {
            total1 += num;
            String numStr = Integer.toString(num);
            for (int i = 0; i < numStr.length(); i++) {
                total2 += Character.getNumericValue(numStr.charAt(i));
            }
        }

        return Math.abs(total1 - total2);
    }
}
