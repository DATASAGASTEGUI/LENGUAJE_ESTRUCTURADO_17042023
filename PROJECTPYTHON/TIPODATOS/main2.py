import os

os.system('cls')

a = 5
b = '6'
#r = a + b

print("Tipo a: ", type(a))
print("Tipo b: ", type(b))

if isinstance(a,int) and isinstance(b,int):
   r = a + b
else:
   print("NO SE PUEDEN SUMAR")

#print('Suma: ', r)