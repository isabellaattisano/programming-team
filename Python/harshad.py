number = input()
digits = list(number)
number = int(number)

def summ(digitss):
    summm  = 0
    for x in digitss:
        summm += int(x)
    return summm

while number % summ(digits) != 0:
    number+=1
    strin = str(number)
    digits = list(strin)

print(number)
