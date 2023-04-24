import os

#RECORRER UNA CADENA X ELEMENTO
def ejemplo1(): 
    cadena = 'Hola Mundo'
    for e in cadena:
        print(e, end='')

#RECORRER UNA CADENA X INDICE
def ejemplo2():
    cadena = 'Hola Mundo'
    for i in range(len(cadena)):
        print(cadena[i], end=',')

#RECORRER UNA CADENA POR INDICE Y ELEMENTO
def ejemplo3():
    cadena = 'Hola Mundo'
    for i in enumerate(cadena):
        print('%5d %-5s' % (i), end='')

#RECORRER UNA CADENA COMO UNA LISTA DE CARACTERES
def ejemplo4():
    cadena = 'Hola Mundo'
    lista = list(cadena)
    print(lista)
    for e in lista:
        print(e, end='')


if __name__ == "__main__":
   os.system('cls')
   ejemplo3()