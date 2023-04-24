
import os
import random as r

def main():
    os.system("cls")
    nf = 4
    nc = 5
    matriz = []
    for i in range(nf):
        fila = []
        for j in range(nc):
            valor = r.randint(1,6)
            fila.append(valor)
        matriz.append(fila)

    print(matriz)

    for i in range(nf):
        for j in range(nc):
            if matriz[i][j] % 2 == 0:
               matriz[i][j] = 0
            else:
               matriz[i][j] = 1

    print(matriz)

if __name__ == "__main__":
   main()