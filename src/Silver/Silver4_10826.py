n = int(input())

# def fibo(num):    # 재귀함수 방식으로 구현하면 속도가 너무 느려서 런타임에러 발생
#     if num <= 1:
#         return num
#     else:
#         return fibo(num-1)+fibo(num-2)


def fibo(num):
    f = [0, 1]
    for i in range(2, num+1):
        f.append(f[i-1]+f[i-2])
    return f[num]


print(fibo(n))
