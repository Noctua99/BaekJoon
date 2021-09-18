test = int(input())
apart = [[0 for i in range(15)] for j in range(15)]

apart[0] = [i for i in range(15)]


for i in range(1, 15):
    for j in range(1, 15):
        apart[i][j] = apart[i - 1][j] + apart[i][j - 1]

for i in range(test):
    floor = int(input())
    num = int(input())
    print(apart[floor][num])
