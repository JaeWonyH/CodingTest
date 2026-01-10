def solution(n, k):
    total = (12000 * n) + (2000 * k)
    service = n // 10
    answer = total - (2000 * service)
    return answer