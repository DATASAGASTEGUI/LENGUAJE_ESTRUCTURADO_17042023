import os

os.system('cls')
cantidad = int(input('Cantidad de primos que desea? '))
vector = []
n = 1
c = 0
while True:
    bandera = True
    n = n + 1
    for i in range(2, n):
        if n % i == 0:
           #print("No Primo")
           bandera = False
           break
    if bandera:
       c = c + 1
       # print('Primo: ', n, " ", c)
       vector.append(n)
    if c == cantidad:
       break
    
print("Lista Primos: ", vector)

'''
# HACER UN PROGRAMA QUE GUARDE EN UN VECTOR(LISTA) 
# LOS N NUMEROS PRIMOS
import os
os.system('cls')

def es_primo(numero):
   if numero < 2:
        return False
   for i in range(2, int(numero**0.5) + 1):
      if numero % i == 0:
          return False
   return True

numeros_primos = []
numero = 2

while len(numeros_primos) < 20:
   if es_primo(numero):
        numeros_primos.append(numero)
   numero += 1
print(numeros_primos)   
'''