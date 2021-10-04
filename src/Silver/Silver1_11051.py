import sys
from math import factorial

N, K = map(int, sys.stdin.readline().split())

bio_coef = factorial(N)//factorial(K)//factorial(N-K)
result = bio_coef % 10007
print(result)
