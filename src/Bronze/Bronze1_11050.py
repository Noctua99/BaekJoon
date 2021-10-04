import math
N, K = map(int, input().split())

res = math.factorial(N)//math.factorial(K)//math.factorial(N-K)
print(res)