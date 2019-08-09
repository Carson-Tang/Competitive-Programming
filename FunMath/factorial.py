import sys
input = sys.stdin.readline
n = int(input())
for i in range(n):
    v = int(input())
    if(v>34) : print(0)
    else :
        j = 1
        for k in range(2,v+1):
            j*=k
        print(j%4294967296)
