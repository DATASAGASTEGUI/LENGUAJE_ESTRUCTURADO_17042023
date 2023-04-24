import os
import random

def main():
    os.system("cls")
    sinrepetir = []
    matriz = []
    for i in range(3):
        fila = []
        for j in range(3):
            while True:
                  valor = random.randint(1,20)
                  if valor not in sinrepetir:
                     fila.append(valor)
                     sinrepetir.append(valor)
                     break
        matriz.append(fila)
    
    print(matriz)
                      
if __name__ == "__main__":
   main()