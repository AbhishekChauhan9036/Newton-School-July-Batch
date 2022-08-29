def xorPair(N,C,array):
    from itertools import combinations
    for i in combinations(array,r=2):
        if i[0]^i[1]==C :
            return "Yes"
    return "No"
test_case = int(input())
while test_case>0:
    N,C = list(map(int,input().split()))
    print(xorPair(N,C,list(map(int,input().split()))))
    test_case -=1