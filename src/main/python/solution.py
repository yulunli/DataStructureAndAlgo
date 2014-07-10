def single_sum(x, n):
    return int(int(int((1+x/n)) * int((x/n)) * n) / 2)

def multi_sum(n):
    return single_sum(n-1, 3) + single_sum(n-1, 5) - single_sum(n-1, 15)

def multi_sum1(n):
    result = 0
    for i in range(n):
        if i % 3 == 0:
            result += i
        elif i % 5 == 0:
            result += i
    return result

total = int(input())
for i in range(100000):
    x = int(input())
    print(multi_sum(x))
