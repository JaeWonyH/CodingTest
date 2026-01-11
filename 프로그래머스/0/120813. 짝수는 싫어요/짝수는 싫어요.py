def solution(n):
    count = n
    answer = []
    while count > 0 :
        if(count%2 == 1):
            answer.append(count)
        count -=1
    answer.sort()
    return answer