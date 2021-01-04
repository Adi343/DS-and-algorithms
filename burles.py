n = 5
s = 1
res = 0
ins = list()
for i in range(n):
    ins = input().split()
    cmd = ins[0]
    if cmd == 'set':
        # write code here
        val = ins[1]
        bur = ins[2]
        if(val == s):
            res += bur
        else:
            n = val
    elif cmd == 'if':
        val = ins[1]
        if n != val:
            exit
