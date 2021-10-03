N = int(input())
len_N = len(str(N))


# 사칙연산을 이용한 방식

result1 = 0
for i in range(len_N-1):
    result1 += 9*(10**i)*(i+1)

result2 = (N - (10**(len_N-1)-1))*len_N

print(result1+result2)


# 문자열을 이용한 방식

# str = "9876543210"
# if N<10:
#     print(N)
# else:
#     result = 9*int(str[-len_N:-1])+(N-int('9'*(len_N-1)))*len_N
#     print(result)


# 자릿수가 변할 때마다 조건문을 이용해 출력하는 방식

# if N < 10:
#     print(N)
# elif N < 100:
#     print(9+(N-9)*2)
# elif N < 1000:
#     print(9*21+(N-99)*3)
# elif N < 10000:
#     print(9*321+(N-999)*4)
# elif N < 100000:
#     print(9*4321+(N-9999)*5)
# elif N < 1000000:
#     print(9*54321+(N-99999)*6)
# elif N < 10000000:
#     print(9*654321+(N-999999)*7)
# elif N < 100000000:
#     print(9*7654321+(N-9999999)*8)
# else:
#     print(9*87654321+9)
