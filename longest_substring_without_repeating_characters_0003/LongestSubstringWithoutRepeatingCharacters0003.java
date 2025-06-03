package longest_substring_without_repeating_characters_0003;


import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters0003 {
    public static void main(String[] args) {
        System.out.println(solution("pwwkew"));
    }
    public static int solution(String s){
        int len = s.length();
        int maxLen = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for(int end = 0; end < len; end ++){
            char c = s.charAt(end);
            while(set.contains(s.charAt(end))){
                //if set.contains(end) == true : there are duplicated therefore while moving start point, shrinking sliding window - remove character of start point
                set.remove(s.charAt(start));
                start ++;
            }
            set.add(c);
            maxLen=Math.max(maxLen,end-start+1);
            // end-start+1 : To find how many characters are incoulded in the window range.
        }
        return maxLen;
    }
}
