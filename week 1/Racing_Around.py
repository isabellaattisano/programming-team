import math

c = (math.pi * 60)/ 28

N = int(input())
ls = []
for i in range(26):
    ls.append(chr(65+i))

ls.append(' ')
ls.append("'")

for i in range(N):
    length = 0

    str = input()

    for j in range(len(str)-1):
        count = 0
        count2 = 0

        count = abs(ls.index(str[j])-ls.index(str[j+1]))
        count2 = (28 - abs(ls.index(str[j])-ls.index(str[j+1])))

        length += (min(count, count2)*c)


    print(length/15 + len(str))







