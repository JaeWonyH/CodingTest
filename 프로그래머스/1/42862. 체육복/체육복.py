def solution(n, lost, reserve):
    students = [1] * n

    # 도난/여벌 반영
    for x in lost:
        students[x - 1] -= 1
    for x in reserve:
        students[x - 1] += 1

    # 빌려주기 (왼쪽 -> 오른쪽 순서)
    for i in range(n):
        if students[i] == 0:
            # 왼쪽 학생에게 빌릴 수 있으면 먼저 빌림
            if i - 1 >= 0 and students[i - 1] == 2:
                students[i] += 1
                students[i - 1] -= 1
            # 아니면 오른쪽 학생에게 빌림
            elif i + 1 < n and students[i + 1] == 2:
                students[i] += 1
                students[i + 1] -= 1

    # 체육복 있는 학생 수 세기 (리스트 pop 같은거 하지 않기)
    answer = sum(1 for x in students if x > 0)
    return answer
