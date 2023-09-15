import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list1 = new ArrayList<>();

        for (int num : nums){
            list1.add((num*num));
        }

        Collections.sort(list1);
        int[] result = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++){
            result[i] = list1.get(i);
        }
        return result;
    }
}