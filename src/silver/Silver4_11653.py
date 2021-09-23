n = int(input())
i = 2
while(i*i <= n):
  if n % i == 0:
    n //= i
    print(i)
  else:
    i += 1
if n > 1:
    print(n)