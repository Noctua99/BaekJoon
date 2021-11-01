import sys


def prime_List(n):  # 에라토스테네스의 체
    primeList = [True]*(n+1)
    primeList[0] = primeList[1] = False
    sqrtN = int(n**0.5)

    for i in range(2, sqrtN+1):
        if primeList[i] == True:
            for j in range(i*i, n+1, i):
                primeList[j] = False
    return primeList


sys.stdin.readline()    # 수의 개수는 필요하지 않으므로 저장하지 않음
lst = list(map(int, sys.stdin.readline().split()))

primeList = prime_List(1000)    # 1~1000까지 소수일 때 True인 리스트 생성

count = 0
for i in lst:
    if primeList[i]:
        count = count+1
print(count)
