def solution(money):
    answer = []
    if money < 5500:
        answer.append(0)
        answer.append(money)
    elif money >=5500:
        if money %5500 ==0:
            answer.append(money//5500)
            answer.append(0)
        else:
            answer.append(money //5500)
            answer.append(money - 5500*(money//5500))
    return answer