# EVALULAR LA ENTRADA DE SOLO NUMEROS ENTEROS

import os
import re

os.system('cls')
patron = "[0-9]+"   # 1, 22, 34343,  234234

while True:
    numero = input("Infrese Número: ")
    correcto = re.fullmatch(patron,numero)
    if correcto:
       break
print("Numero: ", numero)