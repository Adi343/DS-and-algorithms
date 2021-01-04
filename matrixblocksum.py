mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
K = 1
ans = [[0 for i in range(len(mat[0]))]for j in range(len(mat))]
temp = 0

for a in range()
  temp = 0
   for i in range(i-K, i+K+1):
        for j in range(j-K, j+K+1):
            temp += mat[i][j]
    ans[a][b] = temp
