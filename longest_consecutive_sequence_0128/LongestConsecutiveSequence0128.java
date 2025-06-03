package longest_consecutive_sequence_0128;

import java.util.*;

public class LongestConsecutiveSequence0128 {
    public static void main(String[] args) {
        System.out.println(cal(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    public static int cal(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int maxLen = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentLen = 1;
                int current = num;

                while(set.contains(current+1)){
                    current++;
                    currentLen ++;
                }
                maxLen = Math.max(currentLen, maxLen);
            }
        }
        return maxLen;
    }
}
