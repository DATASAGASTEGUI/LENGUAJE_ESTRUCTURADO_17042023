import os
import re
def ejemplo1():
    cadena = 'Dirección Pardo 234, Bloque 3, Piso 2'
    patron = "[0123456789]" # "[0-9]"
    for e in cadena:
        if re.fullmatch(patron, e):
            cadena = cadena.replace(e,'')
    print(cadena)



if __name__ == "__main__":
   os.system('cls')
   ejemplo1()