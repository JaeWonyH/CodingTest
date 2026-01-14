def solution(seoul):
    answer = ''
    for i,x in enumerate(seoul):
        if(x=='Kim'):
            return '김서방은 ' + str(i)+'에 있다'
    return answer