public class Solution {
    public int countDigits(int num) {
        int count = 0;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (num % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
