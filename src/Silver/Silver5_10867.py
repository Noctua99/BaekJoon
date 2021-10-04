import sys

sys.stdin.readline()
input_list = list(map(int, sys.stdin.readline().split()))
input_set = set(input_list)
revised_list = list(input_set)
revised_list.sort()
result = ""
for i in revised_list:
    result += (str(i)+' ')
print(result)
