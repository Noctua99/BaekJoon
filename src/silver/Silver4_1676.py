N = int(input())


def factorial(number):
    if number == 0:
        factorialNum = 1
    else:
        factorialNum = 1
        for i in range(2, number+1):
            factorialNum = factorialNum*i
    return factorialNum


factorialN = str(factorial(N))
deletedZero = str(factorial(N)).rstrip('0')
print(len(factorialN)-len(deletedZero))