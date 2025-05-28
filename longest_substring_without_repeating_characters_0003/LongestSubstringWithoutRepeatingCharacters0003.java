package longest_substring_without_repeating_characters_0003;

public class LongestSubstringWithoutRepeatingCharacters0003 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcbb"));
    }
    public static int solution(String s){
        int max = 0;
        int an = 1;
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) - s.charAt(i-1) ==1){
                an++;
            }else{
                an = 1;
            }
            if(max < an ) max = an;
        }
        return max;
    }
}
