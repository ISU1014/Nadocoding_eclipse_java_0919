# 21
letters ="python"
print(letters[0],letters[2])

# 22
license_plate = "24가 2210"
print(license_plate[4:8])

#23
string = "홀짝홀짝홀짝"
print(string[::2])

#24
string = "PYTHON"
print(string[::-1])

#25
phone_number = "010-1111-2222"
print(phone_number.replace("-"," "))
print(phone_number.split("-"))

#26
phone_number = "010-1111-2222"
print(phone_number.replace("-",""))

# 27
url = "http://sharebook.kr"
print(url[-2:])
url_split = url.split('.')
print(url_split[-1])
print(url_split[1])

#28 문자열은 immutable
# lang = "python"
# lang[1] = "P"
# print(lang)
# 문자열을은 수정할 수 없기 때문에 할당(assignment) 메서드 지원X

#29
string = 'abcdfe2a354a32a'
string = string.replace('a', 'A')
print(string)
#string.upper(객체)
string = 'abcdfe2a354a32a'
print(string.replace('a', 'A'))

#30
string = 'abcd'
string.replace('b', 'B')
print(string)

string=string.replace('b', 'B')
print(string)



