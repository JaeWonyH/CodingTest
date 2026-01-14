a = int(input())

def fun(n):
    if n%2==0:
        return str(n)+" is even"
    else:
        return str(n)+" is odd"
    
print(fun(a))