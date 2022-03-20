S = input()
P = input()

if(S == P):
    print("Yes")

else:
    str = ''
    for i in P:
        if ord(i) < 97:
            str += i.lower()
        else:
            str += i.upper()
    if(S == str):
        print("Yes")
    else:
        if(S[1:] == P and ord(S[0])<58):
            print("Yes")
        else:
            if (S[:-1] == P and ord(S[-1])<58):
                print("Yes")
            else:
                print("No")