def find_points(letter1, letter2, num1, num2):
    moves = [[(letter1, num1)]]
    while True:
        point = moves[0]
        moves.pop(0)
        lett, num = point[-1]
        if lett == letter2 and num == num2:
            return point
        for i in range(1, 9):
                if 64 < i+ lett < 73 and 0 < i + num <= 8:
                    moves.append(point + [(i+ lett, i + num)])
                if 64 < lett -i < 73 and 0 < num -i <= 8:
                    moves.append(point + [(lett -i, num -i)])
                if 64 < lett - i < 73 and 0 < num + i <= 8:
                    moves.append(point + [(lett - i, num + i)])
                if 64 < lett + i < 73 and 0 < num - i <= 8:
                    moves.append(point + [(lett + i, num - i)])

n = int(input())
for i in range(n):
    line = input().split()
    letter1 = ord(line[0])
    num1 = int(line[1])
    letter2 = ord(line[2])
    num2 = int(line[3])

    if(letter1 + letter2 + num1 + num2) %2 != 0:
        print("Impossible", end ="")
    elif((letter1 == letter2) and num2 == num1 ):
        print("0", chr(letter2), num2, end ="")
    # elif(abs(letter1 - letter2)  == abs(num1 - num2)):
    #   print("1", chr(letter2), num2, end ="")
    else:
        answer = find_points(letter1, letter2, num1, num2)
        print(len(answer) -1, end =" ")
        for i in answer:
            print(chr(i[0]), i[1], end = " ")
    print()





