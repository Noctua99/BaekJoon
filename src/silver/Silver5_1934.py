import sys
import math

# 반복문을 이용
def gcd(a, b):
    while b > 0:
        r = a % b
        a = b
        b = r
    return a

# 재귀함수를 이용
def gcdRecur(a, b):
    if b == 0:
        return a
    else:
        return gcdRecur(b, a % b)


T = int(sys.stdin.readline())

s = ""
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    gcdAB = gcdRecur(A, B)
    lcm = int(A*B/gcdAB)
    # sys.stdout.write(str(lcm)+'\n')
    s = s+str(lcm)+'\n'
    # print(lcm)
sys.stdout.write(s)
