# # # # file = open('a.txt', 'r')

# # # # print(file.read())


# # # with open("a.txt", "r") as f:

# # #     for line in f: 
# # #         content = line.strip()
# # #         print(content)


# # with open("data.txt", "x") as f:
# #     f.write("Hello, world!\n")


# with open("data.txt", "a") as f:
#     f.write("Another line.\n")


# with open("data.txt", "r") as f:
#     line1 = f.readline()
#     line2 = f.readline()
#     line3 = f.readline()
#     line4 = f.readline()  # End of file

# print(line1)  # 'Python\n'
# print(line2)  # 'Java\n'
# print(line3)  # 'C++\n'
# print(line4)  # ''


# with open("abc.txt", "x") as f: 
#     with open("data.txt", "r") as f1:
#         data = f1.read()
#         f.write(data)



import os

os.remove("data.txt")  # Deletes the file 'data.txt'