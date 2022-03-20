correct = int(input())
friend = input()
yours = input()

same = 0
different =0

for i in range(len(friend)):
    if friend[i] == yours[i]:
        same+=+1
    else:
        different+=1

if same >= correct:
    print(correct + different)

elif same < correct:
    print(same+(len(friend)-correct))





