import os

def ejemplo1():
    cadena = 'En un puerto italiano' # [inicio:fin:paso]
    cadena1 = cadena[6:12:1]
    print(cadena1)
    cadena2 = cadena[6:12:2]
    print(cadena2)
    cadena3 = cadena[3:4]
    print(cadena3)
    cadena4 = cadena[::]
    print(cadena4)
    cadena5 = cadena[::-1]
    print(cadena5)
    cadena6 = cadena[11:5:-1]
    print(type(cadena6))

    '''
    012345
    puerto
    0 2 4
    
    '''



if __name__ == "__main__":
   os.system('cls')
   ejemplo1()