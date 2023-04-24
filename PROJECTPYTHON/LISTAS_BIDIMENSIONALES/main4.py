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

    for fila in matriz:
        minimo = min(fila)
        maximo = max(fila)
        media = sum(fila) / len(fila)
        print('Fila:', fila)
        print('Minimo:', minimo)
        print('Maximo:', maximo)
        print('Media:', media)
        print()
    
          
if __name__ == "__main__":
   main()