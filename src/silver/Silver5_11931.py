import sys


N = int(sys.stdin.readline())
lst = [0]*N
for i in range(N):
    lst[i] = int(sys.stdin.readline())
lst.sort()
lst.reverse()

result = ""
for i in lst:
    result += (str(i)+'\n')

sys.stdout.write(result)
