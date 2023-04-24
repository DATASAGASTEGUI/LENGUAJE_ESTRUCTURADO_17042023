import os
import re

def ejemplo1():
   cadena = input('Ingrese Cadena? ')
   subcadena = input('Ingrese subcadena? ')
   aux = cadena[0:len(subcadena)]
   if subcadena == aux:
      print('SI')
   else:
      print('NO')

def ejemplo2():
    cadena = input('Ingrese Cadena? ')
    subcadena = input('Ingrese subcadena? ')
    if cadena.startswith(subcadena):
        print('SI')
    else:
        print('NO')

def ejemplo3():
    cadena = input('Ingrese Cadena? ')
    subcadena = input('Ingrese subcadena? ')
    patron = "^" + subcadena
    if re.search(patron,cadena):
       print('SI')
    else:
       print('NO')

if __name__ == "__main__":
   os.system('cls')
   ejemplo3()