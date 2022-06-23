num = int(input())

for i in range(num) :
    r = int(input())
    sc = {}

    for i in range(r) :
        a, b = input().split()
        b = int(b)
        sc[a] = b
        
        c = dict(zip(sc.values(), sc.keys()))
        print(sc[max[c]])
            
        