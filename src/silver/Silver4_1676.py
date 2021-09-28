N = int(input())


def factorial(number):
    if number == 0:
        factorialN = 1
    else:
        factorialN = 1
        for i in range(2, number+1):
            factorialN = factorialN*i
    return factorialN


reversed_facto = reversed(str(factorial(N)))
count = 0
for i in reversed_facto:
    if i == '0':
        count += 1
    else:
        break
print(count)
