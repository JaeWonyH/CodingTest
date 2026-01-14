def solution(my_string):
    for v in "aeiou":
        my_string = my_string.replace(v, "")
    return my_string
