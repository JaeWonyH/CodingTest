def solution(absolutes, signs):
    answer = 0
    
    nums = []
    for i,x in enumerate(absolutes):
        if(signs[i] == True):
            nums.append(x)
        elif(signs[i] == False):
            nums.append(-x)
    for x in nums:
        answer +=x
    return answer