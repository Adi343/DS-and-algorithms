t = int(input())

for i in range(t):
    n = int(input())
    arr = input().split(' ')
    nums = list(map(int, arr))
    i = 0
    j = n-1
    left = 0
    right = 0

    if(n % 2 == 0):
        for i in range(0, n//2):
            left += nums[i]
            right += nums[j]
            i += 1
            j -= 1
        if(left == right):
            print("YES")
        else:
            print("no")

    else:
        print("no")
