def twoSum(nums,target) :
    tempMap = {}
    answer = []
    for i , num in enumerate(nums) :
        temp = target - num
        if temp in tempMap:
            answer = [tempMap[temp], i]
        tempMap[num] = i
    return answer

print(twoSum([1,2,3], 3))