import os

def ejecutar1():
    os.system("cls")
    print('1. LLENAR UNA MATRIZ')
    print('--------------------')
    matriz = [[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9]] # 3x3 = fxc
    
    print('1. RECORRER LA MATRIZ POR INDICE')
    print('--------------------------------')
    nf = len(matriz)
    nc = len(matriz[0])
    for i in range(nf):
        for j in range(nc):
            valor = matriz[i][j]
            print("%5d" % (valor),end='')
        print()

    print('1. RECORRER LA MATRIZ POR ELEMENTO')
    print('----------------------------------')
    for fila in matriz:
        for e in fila:
            print("%5d" % (e),end='')
        print()

    print('3. RECORRER LA MATRIZ POR FILA')
    print('------------------------------')
    for fila in matriz:
        print(fila)

    print('4. MOSTRAR TODA LA MATRIZ')
    print('-------------------------')
    print(matriz)

def ejecutar2(): 
    os.system("cls")
    print('1. LLENAR UNA MATRIZ')
    print('--------------------')
    nf = int(input('Ingrese Número Filas? '))
    nc = int(input('Ingrese Número Columnas? '))
    matriz = []
    for i in range(nf):
        fila = []
        for j in range(nc):
            valor = int(input(f'Elemento [{i},{j}] = '))
            fila.append(valor)
        matriz.append(fila)

    print('1. RECORRER LA MATRIZ POR INDICE')
    print('--------------------------------')
    nf = len(matriz)
    nc = len(matriz[0])
    for i in range(nf):
        for j in range(nc):
            valor = matriz[i][j]
            print("%5d" % (valor),end='')
        print()

    print('1. RECORRER LA MATRIZ POR ELEMENTO')
    print('----------------------------------')
    for fila in matriz:
        for e in fila:
            print("%5d" % (e),end='')
        print()

    print('3. RECORRER LA MATRIZ POR FILA')
    print('------------------------------')
    for fila in matriz:
        print(fila)

    print('4. MOSTRAR TODA LA MATRIZ')
    print('-------------------------')
    print(matriz)

if __name__ == "__main__":
   ejecutar1()
   ejecutar2()