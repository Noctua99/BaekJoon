import sys

def zero_Delete(count):
    lst=[0]*count
    for i in range(count):
        input=int(sys.stdin.readline())
        if input==0:
            lst.pop()
        else:
            lst.append(input)
    return lst

K = int(sys.stdin.readline())

lst=zero_Delete(K)

sum=0
for i in lst:
    sum=sum+i
print(sum)