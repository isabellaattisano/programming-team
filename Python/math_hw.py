line = input()
a,b,c,total = line.split()
a = int(a)
b =int(b)
c =int(c)
total =int(total)

count = 0
for i in range(total+1):
    for j in range(total+1):
        for k in range(total+1):
            if(i*a + j*b + k*c == total):
                print(i,j,k)
                count+=1
if count == 0:
    print("impossible")