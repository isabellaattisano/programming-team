lis = list(map(int, input().split()))
lis.sort()
str = input()

for i in range(len(str)):
    if str[i] == 'A':
        print(lis[0], end =" ")

    elif str[i] == 'B':
        print(lis[1], end =" ")

    elif str[i] == 'C':
        print(lis[2], end =" ")
