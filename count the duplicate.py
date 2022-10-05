n = int(input())
l1=[]
for _ in range(n):
    l1.append(int(input()))
duplicates=dict()
for i in l1:
    if i in duplicates:
        duplicates[i]+=1
    else:
        duplicates[i]=1

for key, value in duplicates.items():
    if value>1:
        print(key,value)
    