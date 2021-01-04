t = int(input())

for i in range(t):
    n = int(input())
    res = set()
    for i in range(1, n+1):
        temp = str(i)[::-1]
        temp1 = temp.replace('0', '')
        temp2 = int(temp1[::-1])
        tempRes = i/temp2
        res.add(tempRes)
    print(len(res))
