attacks = [1, 2]

res = 0
length = len(attacks)

if length == 1:
    res = 2
else:
    for i in range(len(attacks)-1):
        if(attacks[i+1]-attacks[i]+2 > 2):
            res += 2

print(res)
