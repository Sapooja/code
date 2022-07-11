import re
text="Hey there"
a=re.search("Hey", text)
if a:
    print("word found")
else:
    print("word not found")