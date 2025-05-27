## JavaSolution. Brute Force approach.
```commandline
 public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                        answer[0] = i;
                        answer[1] = j;
                }
            }
        }
        return answer;
    }
```
I initially solved it this way, but since the time complexity is O(n²), I decided to try a different way.
Using a hash map, it can be solved within O(n) time complexity.
```commandline
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
```
> Check if the difference between the current number and the target exists in the previously stored values.
If the sum of the current value and any stored value in the hashMap does not equal the target,
store the current number along with its index in the hashMap.