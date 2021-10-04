N = int(input())


# 1. b loop를 a => (N-a)/2, N = 50000일 때 약 2억번정도 연산이 수행됨, Python3로 하면 시간초과
# 2. b loop를 (N-a)/2 => 2, else: break 추가, N = 50000일 때 약 5천만번정도 연산이 수행됨, Python3로 하면 시간초과
# 다른 언어들은 2중 loop 돌려도 통과가 가능하지만 파이썬만 안되서 PyP3로 돌림

count = 0

for a in range(1, N//3+1):
    for b in range((N-a)//2, a-1, -1):
        c = N-a-b
        if a+b > c:
            print(f'if : {a,b,c}')
            count += 1
        else:
            print(f'else : {a,b,c}')
            break
print(count)
