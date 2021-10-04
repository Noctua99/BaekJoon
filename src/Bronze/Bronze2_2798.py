import sys
from itertools import combinations, permutations, product

N, M = map(int, sys.stdin.readline().split())
data = list(map(int, sys.stdin.readline().split()))
datalist = list(combinations(data, 3))

maxsum = 0
for i in datalist:
    sum1 = sum(i)
    if sum1 <= M:
        if sum1 > maxsum:
            maxsum = sum1
    else:
        continue


sys.stdout.write(str(maxsum))