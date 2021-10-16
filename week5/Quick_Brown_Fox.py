num = int(input())
alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
for i in range(num):
    se = []
    spl = input()
    for j in range(len(spl)):
        if ord(spl[j].lower()) >= 97 and ord(spl[j].lower()) <= 122:
            se.append(spl[j].lower())

    se = set(se)
    if len(se) == 26:
        print("pangram")
    else:
        print("missing", end=" ")

        for a in alphabet:
            if a not in se:
                print(a, end="")
        print()
