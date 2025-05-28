# Longest Substring Without Repeating Characters 
> java version
## Brute Force Approach
Completely wrong approach.   
I misunderstood with the question. 
I was looking for the longest increasing substring like "abc", 
not just a substring without duplicates.  
```commandline
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
```
