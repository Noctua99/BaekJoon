import sys


def fiboRecur(n):
    if n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return fiboRecur(n - 1) + fiboRecur(n - 2)


def fiboFor(n):
    prev, curr = 0, 1
    for _ in range(n-1):
        prev, curr = curr, prev+curr
    return curr


num = int(sys.stdin.readline())

print(fiboFor(num))
