#31
a = "3"
b = "4"
print(a+b)

#32
print("HI "*3)

#33
print("-"*50)

#34
t1 = 'python'
t2 = 'java'
print((t1+" "+t2+" ")*4)

#35
name1 = "김민수" 
age1 = 10
name2 = "이철희"
age2 = 13
print("이름 : "+name1+" 나이 :"+str(age1))
print("이름 : "+name2+" 나이 :"+str(age2))

#포맷팅
print("이름 : %s 나이 : %d"%(name1,age1))
print("이름 : {} 나이 : {}".format(name2,age2))
print("이름 : {} 나이 : {}".format(name1,age1-2))
print(f"이름 : {name1} 나이 : {age1}")

#36
print('-'*10)
name1 = "김민수" 
age1 = 10
print("이름 : {} 나이 : {}".format(name1,age1))

#37
print('-'*10)
name1 = "김민수" 
age1 = 10
print(f"이름 : {name1} 나이 : {age1}")

#38
상장주식수 = "5,969,782,550"
상장주식수 = 상장주식수.replace(',','')
print(상장주식수)
print(type(상장주식수))
상장주식수 = int(상장주식수)
print(type(상장주식수))
















