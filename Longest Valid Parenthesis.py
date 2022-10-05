string = input()
count1=0
count2=0
for i in string:
    if i =="(":
        count1+=1
    if i==")":
        count2+=1

if count1<count2:
    print(count1*2)
else:
    print(count2*2)