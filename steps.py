n = 8
t = n
j = 1
for i in range(1, n+1):
    t = t - j
    j += 1
    if(t == 0):
        print(True)
        print(j-1)
        break
    elif t < 0:
        print(False)
        print(j-2)
        break
