import sys

N = int(sys.stdin.readline())

set = set()
for i in range(N):
    set.add(int(sys.stdin.readline()))
lst = list(set)
lst.sort()
for i in lst:
    sys.stdout.write(str(i)+'\n')