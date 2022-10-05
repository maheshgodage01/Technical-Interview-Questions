string = input()
l1=[]
for i in range(len(string)):
    str1=[]
    for j in range(i,len(string)):
        if string[j] in str1:
            l1.append(len(str1))
            break;
            
        else:
            str1.append(string[j])
    else:
        l1.append(len(str1))

print(max(l1))