#1 반복문으로 줄마다 print하는 방법

# N = int(input())  # 1 <= N <= 100


# def star(number):   # 가독성을 위해 함수로 만들었지만 없어도 무방
#     if number % 2 != 0:  # number == 홀수
#         print('* '*(number//2+1))
#         print(' *'*(number//2))
#     else:               # number == 짝수
#         print('* '*(number//2))
#         print(' *'*(number//2))


# for _ in range(N):  # 함수 star()를 N번만큼 반복
#     star(N)

#2 하나씩 출력하지 않고 문자열로 만들어서 한번에 출력하는 방법

N = int(input())  # 1 <= N <= 100

result = ""
if N % 2 != 0:
    result = result+'* '*(N//2+1)+'\n'+' *'*(N//2)+'\n'
else:
    result = result+'* '*(N//2)+'\n'+' *'*(N//2)+'\n'

print(result*N, end="") # 문자열 result를 N번만큼 반복
