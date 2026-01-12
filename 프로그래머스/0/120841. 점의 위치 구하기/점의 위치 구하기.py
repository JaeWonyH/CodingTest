def solution(dot):
    answer = 0
    if dot[0] > 0 and dot[1] >0:
        return 1
    if dot[0] > 0 and dot[1] <0:
        return 4
    if dot[0] < 0 and dot[1] <0:
        return 3
    if dot[0] < 0 and dot[1] >0:
        return 2
    return answer