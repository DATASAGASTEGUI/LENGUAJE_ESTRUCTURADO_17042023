import os

os.system('cls')

while True:
      cadena = input('Ingrese Palabra? ')
      lista = list(cadena)
      invertir = list(reversed(lista))
      if lista == invertir:
         print('SI PALIDROMO')
      else:
         print('NO PALIDROMO')



'''
invertir = list(reversed(lista))


print(invertir)
cont=0

for i in range(len(cadena)):
    if lista[i]==invertir[i]:
        print("Caracter igual",lista[i],invertir[i])
        cont +=1


if cont==0:
    print("Las cadenas son diferentes")
'''