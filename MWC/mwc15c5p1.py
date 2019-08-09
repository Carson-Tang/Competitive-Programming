import statistics
n = int(input())
arr = list(map(float,input().split()))
print(statistics.mean(arr))
print(statistics.median(arr))
mp = {}
mx = 0
for i in range(n):
    if arr[i] not in mp: mp[arr[i]]=0
    mp[arr[i]]+=1
    mx = max(mx,mp[arr[i]])
out = []
for i in mp:
    if mp[i]==mx: out.append(i)
out = sorted(out)
mode = ""
for i in out: mode += str(i)+" "
print(mode)
