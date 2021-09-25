import sys
import math

T = int(sys.stdin.readline())

s = ""
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    gcd = math.gcd(A, B)
    lcm = int(A*B/gcd)
    # sys.stdout.write(str(lcm)+'\n')
    s = s+str(lcm)+'\n'
    # print(lcm)
sys.stdout.write(s)