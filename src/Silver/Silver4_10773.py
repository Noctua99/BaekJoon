import sys

def zero_Delete(count):
    lst=[]
    for i in range(count):
        input=int(sys.stdin.readline())
        if input==0:
            lst.pop()
            # 0이 입력되면 가장 최근 입력값을 삭제
        else:
            lst.append(input)
            # 그 외의 경우에는 리스트에 추가
    return lst

K = int(sys.stdin.readline())

lst=zero_Delete(K)

sum=0
for i in lst:
    sum=sum+i
print(sum)