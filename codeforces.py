m = 0
n = 0

bottom = [2, 7, 16, 28, 33, 57, 59, 86, 99]
left = [3, 9, 14, 19, 25, 26, 28, 35, 41, 59, 85, 87, 99, 100]
res = 0
T = max(max(bottom), max(left))

if len(bottom) >= len(left):
    for train1 in bottom:
        if(train1 in left):
            res += 1
else:
    for train1 in left:
        if(train1 in bottom):
            res += 1

print(res)
