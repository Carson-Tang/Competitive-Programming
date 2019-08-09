def fun(a):
    res = [a, 1, a+1, 0]
    return res[a%4]

def solve(a, b):
    return fun(b) ^ fun(a-1)

t = int(input())
for i in range(t):
    x,y=map(int,input().split())
    print(solve(x,y))
