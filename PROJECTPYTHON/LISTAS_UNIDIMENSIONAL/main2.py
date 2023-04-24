import os

if __name__ == "__main__":
    os.system('cls')
    n = int(input('Ingrese longitud lista? '))
    vector = []
    # LLENAR LISTA
    for i in range(n):
        x = int(input('Ingrese elemento? '))
        vector.append(x)
    
    # RECORRER LISTA POR EL INDICE

    for i in range(len(vector)):
        print(vector[i], end='  ')

    print()

    # RECORRER LISTA POR ELEMENTO

    for e in vector:
        print(e, end='  ')

    
