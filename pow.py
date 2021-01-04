import math

math.


def myPow(x, n):
    myList = [x]
    for i in range(1, n+1):
        myList.append(x*myList[i-1])
    print(myList[n-1])


myPow(3.0, 5)
