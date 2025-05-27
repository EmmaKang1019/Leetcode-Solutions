package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));

    }
//    public static int[] twoSum(int[] nums, int target) {
//        int[] answer = new int[2];
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j< nums.length; j++){
//                if(nums[i]+nums[j] == target){
//                        answer[0] = i;
//                        answer[1] = j;
//                }
//            }
//        }
//        return answer;
//    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap();
        int[] answer = new int[2];
        for( int i = 0; i< nums.length; i++){
            int temp = target-nums[i];
            if(hashMap.containsKey(temp)){
                answer = new int[] {hashMap.get(temp),i};
            }
            hashMap.put(nums[i],i);
        }
        return answer;
    }
}
