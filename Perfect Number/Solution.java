class Solution {
    public boolean checkPerfectNumber(int num) {
        int total = 0;
        for (int i = 1; i <= num/2; i++){
            if (num%i == 0){
                total += i;
            }
        }
        return total == num;
    }
}