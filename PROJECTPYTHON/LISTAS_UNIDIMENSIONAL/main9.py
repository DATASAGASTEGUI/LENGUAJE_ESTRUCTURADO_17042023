import os
import re

os.system('cls')

patronL = "[A-ZÑ]"
patronV = "[AEIOUÁÉÍÓÚ]"

oracion = input('INGRESE ORACION? ')

lista = list(oracion)

cv = 0
cc = 0
co = 0

for e in lista:
    if re.fullmatch(patronL,e.upper()):
       if re.fullmatch(patronV,e.upper()):
          cv += 1
       else:
          cc += 1
       #print("LETRA")
    else:
       co += 1
       #print("NO LETRA")

print("Vocales    : ", cv)
print("Consonantes: ", cc)
print("Otros      : ", co)
       
       




'''

def contar_vocales_consonantes(oracion):
    oracion = oracion.lower()

    consonantes = set('aeiou')
    vocales = set('bcdfghjklmnpqrstvwxyz')

    contador_vocales = 0
    contador_consonantes = 0

    for i in oracion:
        if i in vocales:
            contador_vocales += 1
        elif i in consonantes:
            contador_consonantes += 1
    return contador_consonantes, contador_vocales


oracion = input('Ingrese una frase: ')
vocales, consonantes = contar_vocales_consonantes(oracion)
print("Cantidad de vocales: ", vocales)
print("Cantidad de consonantes: ", consonantes)
'''