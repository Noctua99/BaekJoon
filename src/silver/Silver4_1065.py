#Solve1

N = int(input())

count = 0
if N >= 111:
    for i in range(111, N+1):
        if (i//100+i % 10) == (i % 100-i % 10)/5:
            count = count+1
    print(count+99)
elif N >= 100:
    print(99)
else:
    print(N)

# Solve2

# N = int(input())

# count = 0
# if N >= 100:
#     for n in range(100, N+1):
#         nums = list(map(int, str(n)))
#         if (nums[2] + nums[0]) == nums[1]*2:
#             count = count+1
#     print(count+99)
# else:
#     print(N)
