def Sum(N):
    sum=0
    while N > 0:
        sum += N % 10
        N= int(N/10)
    return sum

N = int(input())

while N != 0:
    sum = Sum(N)
    count = 11;
    found = False
    while(found == False):
        if Sum(N*count) ==  sum:
            print(count)
            found = True
        else:
            count+=1

    N = int(input())