import os
import random

def main():
    os.system("cls")
    caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"  # Definimos los caracteres disponibles
    caracter = random.choice(caracteres)  # Obtenemos un carácter aleatorio
    matriz = []
    for i in range(3):
        fila = []
        for j in range(3):
            caracter = random.choice(caracteres)  # Obtenemos un carácter aleatorio   
            fila.append(caracter)
        matriz.append(fila)
        
    print(matriz)
if __name__ == "__main__":
   main()