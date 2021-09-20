import sys

len = int(sys.stdin.readline())
str = sys.stdin.readline()
str = str.strip()

sum = 0
count = 0
for i in str:
    sum = sum+(ord(i)-96)*(31**count)
    count = count+1

print(sum % 1234567891)