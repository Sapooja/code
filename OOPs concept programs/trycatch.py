try:
    fileptr=open("D:\File2.txt")
except:
    print("Pass")
else:
    print("Fail")
finally:
    fileptr.close()
