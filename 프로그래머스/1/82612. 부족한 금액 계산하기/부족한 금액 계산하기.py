def solution(price, money, count):
    answer = -1
    pay = 0
    for i in range(count):
        pay += price*(i+1)

    if(pay <= money):
        return 0
    answer = pay - money
    return answer