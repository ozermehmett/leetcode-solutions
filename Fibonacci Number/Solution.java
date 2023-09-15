class Solution {
    public int fib(int n) {
        if (n < 2){
            return n;
        }
        int num1 = 0;
        int num2 = 1;
        int temp;
        for(int i = 0; i < n-1; i++){
            temp = num2;
            num2 += num1;
            num1 = temp;
        }
        return num2;
    }
}