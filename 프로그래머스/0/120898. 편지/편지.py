def solution(message):
    answer = 0
    
    message_list = list(message)
    for x in message_list:
        answer +=2
    return answer