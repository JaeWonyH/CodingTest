def solution(nums):
    answer = 0
    count = 0
    visited = []
    for i in nums:
        if i not in visited:
            count +=1
            visited.append(i)
    if count >= len(nums)//2:
        return len(nums)//2
    else:
        return count
    return answer