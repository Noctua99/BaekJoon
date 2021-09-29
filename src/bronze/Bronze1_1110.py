N = int(input())    # 0 <= N <= 99
intial_N = N

count = 0
while True:     # N이 충분히 작으므로 반복문을 통해 계산
    tens = N//10
    units = N % 10
    N = units*10+(tens+units) % 10
    count += 1
    if N == intial_N:
        break
print(count)
