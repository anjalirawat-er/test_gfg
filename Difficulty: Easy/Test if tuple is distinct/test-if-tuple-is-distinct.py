arr = tuple(map(int, input().split()))

dict={}
track=False
for i in arr:
    if i in dict:
        dict[i]+=1
        track=False
    else:
        dict[i]=1
        track=True
print(track)
