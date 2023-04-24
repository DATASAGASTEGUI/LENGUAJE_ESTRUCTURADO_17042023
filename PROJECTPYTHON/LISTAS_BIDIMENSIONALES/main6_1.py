
import os
import random

def main():
    os.system("cls")
    lista = list(range(1,21))   
    print(lista)
    matriz = []
    for i in range(3):
        fila = []
        for j in range(3):
            valor = random.sample(lista,1)
            fila.append(valor[0])
            lista.remove(valor[0])
        matriz.append(fila)
        
    print(matriz)
          
if __name__ == "__main__":
   main()