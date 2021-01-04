import re

s = "mississippi"
p = "mis*is*p*."

# txt = re.findall(p, s)

# if txt:
#     print(True)
# else:
#     print(False)

check = False
for i in range(len(p)):
    if p[i] == '*':
        tempP = p[:i]
        for j in range(len(s)):
            if s[j] in tempP:
                check = True
    elif p[i] == '.':
        for j in range(len(s)):
            if s[j] in p:
                check = True

print(check)
