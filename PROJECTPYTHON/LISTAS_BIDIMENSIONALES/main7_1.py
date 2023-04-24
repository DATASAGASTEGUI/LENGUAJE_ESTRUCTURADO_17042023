import os
import random

def main():
    os.system("cls")
    matriz = []
    for i in range(3):
        fila = []
        for j in range(3):
            caracter = chr(random.randint(65,90)) 
            fila.append(caracter)
        matriz.append(fila)
        
    print(matriz)
if __name__ == "__main__":
   main()