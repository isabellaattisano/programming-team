str = input()
answer = ""
count = 0
while count < len(str):
    if(str[count] == 'a' or str[count] == 'e' or str[count] == 'i' or str[count] == 'o' or str[count] =='u'):
        answer += str[count]
        count+=3
    else:
        answer += str[count]
        count += 1

print(answer)
