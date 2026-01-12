def solution(n, t):
    answer = n
    while t > 0 :
        answer *= 2
        t -= 1
    return answer