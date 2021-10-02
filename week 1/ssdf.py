N = int(input())
for i in range(N):
    K, base, number = input().split()
    base=int(base)
    number=int(number)
    power = 0
    squares = 0

    while number > 0:
        LSB = number % base
        squares += LSB**2
        number = int(number/base)

    print(K,squares)