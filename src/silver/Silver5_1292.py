A, B = map(int, input().split())

numLst = [0, ]
numLst_Append = numLst.append
for i in range(1, 46):
    for j in range(i):
        numLst_Append(i)


# 반복문으로 더하기

# sum = 0
# for i in range(A, B+1):
#     sum = sum+numLst[i]
# print(sum)


# 리스트 슬라이싱을 통한 더하기

result = sum(numLst[A:B+1])
print(result)
