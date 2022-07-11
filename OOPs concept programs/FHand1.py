fileptr= open("D:\File2.txt")
fileptr.read()
if fileptr:
    print("Sucessfully opened")
else:
    print("Error occured")
fileptr.close()

with open("D:\File2.txt") as m:
    p=m.read()
    print(p)
