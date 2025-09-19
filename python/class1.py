class Student:
    __college = "XYZ University"
    def __init__(self, name, age):
        self.__name = name
        self.age = age
        self.college = Student.__college

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")


    @staticmethod
    def get_college(cls, college):
        cls.__college = college


class1 = Student("Arjun", 20)
class1.display()
print(f"College: {class1.college}")

print(f"Updated College: {class1.college}")

 # Accessing the private variable directly (not recommended    )

print(f"Private Name: {class1._Student__name}")  # Accessing private variable
print(f"Private College: {class1._Student__college}")  # Accessing private

print("")