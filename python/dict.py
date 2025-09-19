dict = {
    'a' : 1, 
    'b' : 2, 
    'c' : [1, 2, 3, 4, 5],
}

# print(dict['a'])  # Accessing the third element in the list associated with key 'c'
dict['d'] = 3
dict['c'].append(4)


print(dict.items())