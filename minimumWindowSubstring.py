s = "ADOBECODEBANC"
t = "ABC"

m = len(s)
n = len(t)
res = ""
check = 10**6
subStr = ""
left = 0
if m<n:
    res = ""
dict2 = dict()
dict3 = dict()
for j in t:
    if j in dict2.keys():
        dict2[j]+=1
    else:
        dict2[j]=1
        
def containsLetters(str1,str2,dict2):
    dict1 = dict()
    # dict2 = dict()
        
    for i in str1:
        if i in dict1.keys():
            dict1[i]+=1
        else:
            dict1[i]=1
        
                    
    for key in dict2.keys():
        if key not in dict3.keys():
            return False
        elif dict2[key]>dict3[key]:
            return False
        
    return True
        
for right in range(m):
    subStr = s[left:right+1]
    char = s[right]
    # print("char is ",char)
    if char in dict3.keys():
        dict3[char]+=1
    elif char not in dict3.keys():
        dict3[char]=1
    
    while len(subStr)>=n and containsLetters(subStr,t,dict2):
        print("inside while")
        if check>len(subStr):
            res = subStr
            check = len(subStr)
        char = subStr[left-1]
        print("char is ",char)
        print("subStr is ",subStr)
        print("left is ",left)
        print(dict3)
        if char in dict3.keys():
            del dict3[char]
        left+=1
        subStr = s[left:right+1]
                
    print(dict3)
print(res)
                