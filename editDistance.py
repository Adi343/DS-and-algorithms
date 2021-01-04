word1 = "horse"
word2 = "ros"

len1 = len(word1)
len2 = len(word2)
res = 0
if len1 != 0 or len2 != 0:
    i = 0
    j = 0
    while(word1[i] != word2[j]):
        word1[i] = word1[j]
        i += 1
        j += 1
        res += 1

elif len1 == 0:
    res = len2
elif len2 == 0:
    res = len1

print(res)
