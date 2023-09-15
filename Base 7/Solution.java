class Solution {
    public String convertToBase7(int num) {
        if (num == 0){
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder base7 = new StringBuilder();

        while (num > 0){
            base7.insert(0, num%7);
            num /= 7;
        }

        if (isNegative){
            base7.insert(0, "-");
        }

        return base7.toString();
    }
}