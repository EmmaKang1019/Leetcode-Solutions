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

## What I learned
**Sliding Window concept**
Sliding window is a technique that views an array or string as a continuous range (or "window") and solves problems by moving two pointers forward.
You can imagine it as a window sliding over a string. The end pointer moves forward to expand the window, and when a condition is violated (like a duplicate character), the start pointer moves forward to shrink the window.

**Java vs. Python**
In the Java implementation, the Set's contains method was used to check for duplicates,
while in Python, duplicate checks were done by verifying whether the character exists as a key in a dictionary using s[right] in charDict.

In Java, characters are accessed using s.charAt(index),
whereas in Python, strings support indexing directly, so you can access each character using s[index].
