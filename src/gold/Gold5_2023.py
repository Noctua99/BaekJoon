from math import floor


def find_primeNumber(num):
    for i in range(2, floor(int(num)**0.5)+1):
        if int(num) % i == 0:
            return
    if len(num) == N:
        print(num)
        return
    for j in arr2:
        find_primeNumber(num+j)


N = int(input())

arr1 = ['2', '3', '5', '7']
arr2 = ['1', '3', '7', '9']

for i in arr1:
    find_primeNumber(i)