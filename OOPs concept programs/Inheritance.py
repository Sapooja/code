class sample:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print(self.name, self.age)

class child(sample):
    def __int__(self, name, age):
        self.name = name
        self.age = age
    def display1(self):
        print(self.name, self.age)
a=child("choco",12)
a.display()
a.display1()
