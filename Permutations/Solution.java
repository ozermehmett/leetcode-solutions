import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(result, new ArrayList<>(), nums);
        return result;
    }

    public void permuteHelper(List<List<Integer>> result, List<Integer> tempList, int[] nums){
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if (!tempList.contains(nums[i])) {
                    tempList.add(nums[i]);
                    permuteHelper(result, tempList, nums);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}