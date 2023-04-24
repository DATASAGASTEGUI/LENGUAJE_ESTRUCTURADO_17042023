import os
import re

def ejemplo1():
    cadena = 'En un puerto italiano y al pie de la montaña en un al,?'.lower()
    
    patron = "[,?]"
    cadena = re.sub(patron,'',cadena)
    print("Cadena: ", cadena)
    
    listapalabras = cadena.split()
    print(listapalabras)
    palabrasdistintas = []

    for e in listapalabras:
        if e not in palabrasdistintas:
           palabrasdistintas.append(e)

    print(palabrasdistintas)

    c = [0] * len(palabrasdistintas) # [0, 0, 0]

    for i in range(len(palabrasdistintas)):
        for j in range(len(listapalabras)):
            if palabrasdistintas[i] == listapalabras[j]:
               c[i] = c[i] + 1

    print(palabrasdistintas)
    print(c)

if __name__ == "__main__":
   os.system('cls')
   ejemplo1()