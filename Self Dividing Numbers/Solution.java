import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            List<Integer> digits = new ArrayList<>();
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                digits.add(0, digit);
                num /= 10;
            }

            boolean isSelfDividing = true;
            for (int digit : digits) {
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
            }

            if (isSelfDividing) {
                selfDividingNumbers.add(i);
            }
        }

        return selfDividingNumbers;
    }
}
