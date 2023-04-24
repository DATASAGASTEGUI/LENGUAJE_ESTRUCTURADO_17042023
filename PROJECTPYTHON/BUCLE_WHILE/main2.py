# PEDIR INGRESAR EN FORMA INFINITA NUMEROS ENTEROS HASTA
# QUE INGRESE UN NUMERO NEGATIVO
# MOSTRAR LA SUMA DE TODOS LOS NUMEROS INGRESADOS

import os

os.system('cls')

suma = 0 
n = int(input('Ingrese  un numero? '))

while n>= 0:
    suma = suma + n
    n = int(input('Ingrese  un numero? '))

print("Suma: ", suma)

# OTRA FORMA

a = 0
while True:
    n = int(input('Ingrese número: '))
    if n < 0:
       break
    a = a + n
print("Suma: ", a)