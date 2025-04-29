# 128. Longest Consecutive Sequence
>Given an unsorted array of integers nums,  
> return the length of the longest consecutive elements sequence.
### Java ver.

___
## 1. Approach

   At first, I thought I could solve this by sorting the array and checking if the next number is consecutive.
However, there was an issue that I couldn't find longest consecutive sequence
Since I couldn't figure out how to solve this using just an Array, I decided to use a Set instead.


## 2. Solution  
I defined a Set and added each value from given nums array into it.  
> A set is a data structure that stores unique elements without duplicates.   

So I used Set to remove duplicates and 
used `contains()` method to check consecutive number. 
While iterating through the set using a for loop, I checked if the current number was the start of a consecutive sequence
by verifying if `num-1` was not in the set. If it was the start, I stored the current number in a temporary variable `current`
and initialized a `currentLen` variable to 1 to represent the start length of the sequence.
Then, while the set contained `current+1` I incremented both `current` and `currentLen` by 1.

    

## 3. Learning  
   I realized that converting the data into a different data structure can make the problem easier to solve


