def sum_of_digits(num):
    result=0
    while(num>0):
        digit=num%10
        num=num//10
        result+=digit
    return result


n = int(input())
for i in range(n):
    num=int(input())
    print(sum_of_digits(num))