import os
import re

def ejemplo1():
    cadena = 'En un puerto italiano AL PIE DE LA MONTAÑA'
    patron = "[aeiouáéíóú]"
    for e in cadena:
        if re.fullmatch(patron,e.lower()):
           cadena = cadena.replace(e,'x')
    print(cadena)

def ejemplo2():
    cadena = 'En un puerto italiano AL PIE DE LA MONTAÑA'
    patron = "[aeiouáéíóúAEIOUÁÉÍÓÚ]"
    cadean = re.sub(patron,'x',cadena)
    print(cadena)
    
if __name__ == "__main__":
   os.system('cls')
   ejemplo1()