def solution(array, commands):
    answer = []
    
    def func(array, i,j,k):
        slicedarr = array[i-1:j]
        slicedarr.sort()
        return slicedarr[k-1]
    for i in commands:
        answer.append(func(array,i[0],i[1],i[2]))
    return answer