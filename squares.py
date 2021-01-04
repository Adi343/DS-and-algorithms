res = 0
n = 5

nums = []

for i in range(1, n):
    nums.append(i**2)

dp = [[0 for i in range(0, n+1)]for i in range(len(nums)+1)]
print(len(nums))
# print(dp)

for i in range(0, len(dp)):
    for j in range(0, len(dp[0])):
        if i == 0 or j == 0:
            dp[i][j] = 1
print(nums)
print(dp)
print(res)
