M = int(input())
N = int(input())

lst = [False]+[False]+[True]*10000
for num in range(2,101):
    for i in range(num*2,10001,num):
        lst[i]=False

sum=0
first=0
for i in range(M,N+1):
    if lst[i]:
        sum=sum+i
if sum==0:
    sum=-1
for i in range(M,N+1):
    if lst[i]:
        first=i
        break
print(sum)
if sum!=-1:
    print(first)