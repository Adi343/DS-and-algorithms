print('hello')
n = 1
y = 5
steps = 0
res = 0
if y > 0:
    while(steps != y):
        if (steps < y):
            steps += n
            n += 1
            res += 1
        elif(steps == y):
            print(steps)
            exit
        elif (steps > y):
            res -= 1
        print('inside loop')

print(res)
