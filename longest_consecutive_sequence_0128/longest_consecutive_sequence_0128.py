from typing import List


class Solution:
    def logestlongestConsecutive(self, nums: List[int]) -> int :
        numSet = set(nums)
        maxLen = 0
        for n in numSet:
            if (n-1) not in numSet:
                curr = n
                currLen = 1

                while curr+1 in numSet:
                    curr +=1
                    currLen +=1
                print(curr)
                maxLen = max([currLen, maxLen])

        print('MaxLen : ', maxLen)
        return maxLen

sol = Solution()
ans = sol.logestlongestConsecutive([100,4,200,1,3,2])
print(ans)