num = 69

numList = [int(x) for x in str(num)]

for i in range(len(numList)):
    if numList[i] == 6:
        numList[i] = 9
        break

numList = [str(x) for x in numList]
print(''.join(numList))
