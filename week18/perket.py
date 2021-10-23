from itertools import chain, combinations

class ingredient:
    def __init__(self, sour, bitter, name):
        self.sour = sour
        self.bitter = bitter
        self.name = name

def powerset(s):
    return chain.from_iterable(combinations(s, r) for r in range(1, len(s)+1))

N = int(input())
sourness = 1
bitterness = 0
lists = []
for i in range(N):
    line = input()
    s,b = line.split()
    s = int(s)
    b = int(b)
    lists.append(ingredient(s,b, len(lists)))

new_list = list(powerset(lists))

total = []
for i in range(len(new_list)):
    sum = 0
    bitterness = 0
    sourness = 1
    for j in range(len(new_list[i])):
        sourness*= new_list[i][j].sour
        bitterness += new_list[i][j].bitter
        sum = abs(bitterness - sourness)

    total.append(sum)

print(min(total))
