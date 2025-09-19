list = []

while(True): 
    val = input("Enter a fruit name")
    list.append(val)

    if len(list) == 3: 
        break

print(list)