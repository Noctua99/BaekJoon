N = int(input())


result = ""
for i in range(1, N+1):
    result += '*'*i+'\n'

for i in range(N-1, 0, -1):
    result += '*'*i+'\n'

print(result, end='')
