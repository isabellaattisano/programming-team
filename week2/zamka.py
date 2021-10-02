L = int(input())
D = int(input())
X = int(input())

ls = []

for i in range(L, D+1):
    sum = 0
    num = i
    while num > 0:
        sum += num % 10
        num = int(num / 10)

    if sum == X:
        ls.append(i)


print(min(ls))
print(max(ls))