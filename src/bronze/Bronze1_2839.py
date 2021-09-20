import sys

N = int(sys.stdin.readline())

bag = 0
while N >= 0 :
    if N % 5 == 0 :  
        bag += (N // 5)
        sys.stdout.write(str(bag))
        break
    N = N - 3
    bag += 1 
else :
    sys.stdout.write("-1")