package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 1, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int pos = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            map.put(target-nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            
            if(map.containsKey(nums[i]) && pos<2 && target/nums[i] != 2){
                result[pos] = i;
                pos++;
            }
        }
        return result;
    }

}
