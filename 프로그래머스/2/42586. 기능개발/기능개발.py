from collections import deque

def solution(progresses, speeds):
    answer = []
    pq = deque(progresses)
    sq = deque(speeds)
    days = 0

    while pq:
        days += 1

        # 맨 앞 기능이 완료됐으면, 같은 날 완료된 것들 연속으로 배포
        if pq[0] + days * sq[0] >= 100:
            count = 0
            while pq and (pq[0] + days * sq[0] >= 100):
                pq.popleft()
                sq.popleft()
                count += 1
            answer.append(count)

    return answer
