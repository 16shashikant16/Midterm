string1 = "hello Shaun"
string2 = "hello mack"
commonChar = set()

for i in range(len(string1)):
    # if string1[i]==" ": continue
    for j in range(len(string2)):
        if string1[i]==string2[j]:
            commonChar.add(string1[i])

print(commonChar)
