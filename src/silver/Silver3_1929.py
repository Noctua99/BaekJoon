import sys


def sieve_of_eratosthenes(num1, num2):
    lst = [False, False]+[True]*(num2-1)
    sqrt_num = int(num2**0.5)
    for i in range(2, sqrt_num+1):
        for j in range(i*2, num2+1, i):
            lst[j] = False
    return lst


M, N = map(int, sys.stdin.readline().split())

prime_lst = sieve_of_eratosthenes(M, N)
result = ""
for i in range(M, N+1):
    if prime_lst[i]:
        result += str(i)+'\n'
sys.stdout.write(result)
