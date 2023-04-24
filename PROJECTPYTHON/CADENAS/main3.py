import os

def ejemplo1():
    cadena = 'Hola Mundo'
    n = len(cadena)
    s = ''
    for i in range(n-1,-1,-1):
        s = s + cadena[i]
    print('Original : ', cadena)
    print('Invertida: ', s)

def ejemplo2():
    cadena = 'Hola Mundo'
    s = ''
    for e in cadena:
        s = e + s
    print('Original : ', cadena)
    print('Invertida: ', s)

def ejemplo3():
    cadena = 'Hola Mundo'
    s = cadena[::-1]
    print('Original : ', cadena)
    print('Invertida: ', s)

if __name__ == "__main__":
   os.system('cls')
   ejemplo3()