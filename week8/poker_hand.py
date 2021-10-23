list = [a[0] for a in input().split()]
max = 0
for i in range(len(list)):
    if list.count(list[i]) > max:
        max = list.count(list[i])

print(max)
