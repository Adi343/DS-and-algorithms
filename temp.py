t = int(input())
res = 0
for i in range(t):
    w, h, n = input().split(' ')
    w = int(w)
    h = int(h)
    n = int(n)
    while(w % 2 == 0 or h % 2 == 0):

        if(res <= n and n > 1):
            if(w % 2 == 0):
                w = w/2
                res += 2
            elif(h % 2 == 0):
                h = h/2
                res += 2

        elif(n == 1):
            print("YES")
            break
        else:
            break
    #print(res, n)
    if(res >= n):
        print("YES")
    else:
        print("NO")
    res = 0
