def solution(numbers):
    answer = 0
    total = 0
    for x in numbers:
        total += x
        
    avg = total / len(numbers)
    answer = round(avg,1)
    return answer