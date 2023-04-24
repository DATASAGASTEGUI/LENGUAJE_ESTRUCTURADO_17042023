import os

def ejemplo1():
    print("EJEMPLO 1: ELIMINAR POR EL INDICE")
    vector = [2, 1, 2, 4, 6, 7, 8, 9]
    del vector[4]
    print(vector) # [2, 1, 2, 4, 7, 8, 9]

def ejemplo2():
    print("EJEMPLO 2: ELIMINAR POR EL INDICE")
    vector = [2, 1, 2, 4, 6, 7, 8, 9]
    elemento = vector.pop(4)
    print(vector) # [2, 1, 2, 4, 7, 8, 9]
    print(elemento) # 6

def ejemplo3():
    print('EJEMPLO 3: ELIMINAR POR ELEMENTO')
    vector = [2, 1, 2, 4, 6, 7, 8, 9]
    vector.remove(6)
    print(vector) # [2, 1, 2, 4, 7, 8, 9]

if __name__ == "__main__":
    os.system('cls')
    ejemplo3()
