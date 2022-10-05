str_dict=dict()
string = input()
new_str=""
for i in string:
    if i in str_dict:
        str_dict[i]+=1
    else:
        str_dict[i]=1

for key, value in str_dict.items():
    new_str+="{}{}".format(key,value)
    
print(new_str)