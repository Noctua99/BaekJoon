import sys


def prime_List(n):
    primeList = [True]*(n+1)
    primeList[1] = False
    sqrtN = int(n**0.5)
    for i in range(2, sqrtN+1):
        if primeList[i] == True:
            for j in range(i*2, n+1, i):
                primeList[j] = False
    return primeList


sys.stdin.readline()
lst = list(map(int, sys.stdin.readline().split()))

primeList = prime_List(1000)

count = 0
for i in lst:
    if primeList[i]:
        count = count+1
print(count)
