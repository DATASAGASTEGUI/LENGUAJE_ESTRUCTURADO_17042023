# HACER UN PROGRAMA QUE HAGA LA SUMA DE DOS NUMEROS
# EL PROGRAMA DEBE PEDIR LOS DOS NUMEROS POR TECLADO
# EL PROGRAMA EVALUARA LA ENTRADA DE SOLO NUMEROS ENTEROS.

import os
import re

os.system('cls')
patron = "[0-9]+"   # 1, 22, 34343,  234234


res=0

while True:
    numeroA = input("Ingrese primer Número: ")
    numeroB = input("Ingrese segundo Número: ")
    
    if re.fullmatch(patron,numeroA) and re.fullmatch(patron,numeroB):
       res=int(numeroA) + int(numeroB)
       break


print("Numero: ", res)