# Codechef problem code TREE2

# pseudo code
# take input from the program
# sort trees in descending order
# check for various values of H
# repeat above process until H is trees are 0 height


T = int(input())
num = int(input())
trees = list(map(int, input().split()))

trees_new = trees
trees_new.sort(reverse=True)

for i in range(len(trees_new)):
    print(trees_new[i])
