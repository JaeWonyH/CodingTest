from collections import Counter
def solution(array):
    if(len(array)==1):
        return array[0]
    count = Counter(array)
    common = count.most_common(2)  # [(값, 빈도), (값, 빈도)] 형태

    # 원소가 1종류뿐이면 common 길이가 1일 수 있음
    if len(common) == 1:
        return common[0][0]

    # 1등과 2등의 빈도가 같으면 동률
    if common[0][1] == common[1][1]:
        return -1
    return common[0][0]