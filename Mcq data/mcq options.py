import os

with open('C:\\Users\\uejaz\\Desktop\\asd.txt', 'r') as content_file:
    txt = content_file.read()


        

x = txt.split("\n")
n=0


for i in range(len(x)):
    if n%4==0:
        print("}\n,{\""+x[n]+"\",",end="")
    else:
         print("\""+x[n]+"\",",end="")
    n+=1
