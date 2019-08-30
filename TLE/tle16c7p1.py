import sys
input = sys.stdin.readline
t = int(input())
for i in range(t):
    s = input().split()[-1]
    a = s[:s.find("x")]
    b = s[s.find("x")+2:]
    if "x" not in s:
        print("y' = 0")
        continue
    if len(a) == 0: a = 1
    if len(b) == 0: b = 1
    if a == "-": a = -1
    coeff = int(a)*int(b)
    if coeff == 0: 
        print("y' = 0")
        continue
    exp = int(b)-1
    if exp == 0:
        print("y' = "+str(coeff))
        continue
    if coeff == 1: coeff = ""
    elif coeff == -1: coeff = "-"
    if exp == 1: 
        print("y' = "+str(coeff)+"x")
    else :print("y' = "+str(coeff)+"x^"+str(exp))
