def solution(array, height):
    answer = 0
    array.sort()
    
    for i, x in enumerate(array):
        if(x > height):
            return len(array) - i
    return answer