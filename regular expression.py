import re

string = "Today's date is 2023-06-07"

pattern = r"(\d{4})-(\d{2})-(\d{2})"
matches = re.findall(pattern, string)

if matches:
    year, month, day = matches[0]
    print(f"Year: {year}, Month: {month}, Day: {day}")


#2
import re

string = "123 45 6789 01234"

pattern = r"\b\d{3}\b"
matches = re.findall(pattern, string)

print(matches


#3
import re

string = "Hello 123 World 456"

pattern = r"\b\w+\b"
matches = re.findall(pattern, string)

print(matches)


#4
import re

string = "Apple orange Banana elephant"

pattern = r"\b[aeiouAEIOU]\w*\b"
matches = re.findall(pattern, string)


#5
import re

string = "Apple orange Banana elephant"

pattern = r"\b[^aeiouAEIOU\W]\w*\b"
matches = re.findall(pattern, string)

print(matches)


#6

import re

string = "This is a sample string with a, an, and the."

pattern = r"\b(a|an|the)\b"
matches = re.findall(pattern, string)

count = len(matches)
print(f"Total count: {count}")


#7

import re

string = "Hello world Python programming"

pattern = r"\b\w{4,}\b"
matches = re.findall(pattern, string)

print(matches)

#8

import re

string = "This is a test 123"

pattern = r"\d+$"
match = re.search(pattern, string)

if match:
    print("Number found at the end of the string")


#9
    import re

string = "1234 5678 987 2019"

pattern = r"[12]\d{3}"
matches = re.findall(pattern, string)

print(matches)


#10

import re

string = "Apple banana"

pattern = r"a.*"
match = re.search(pattern, string)

if match:
    print("Match found")

print(matches)
