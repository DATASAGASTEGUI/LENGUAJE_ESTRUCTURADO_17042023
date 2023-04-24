import os
import random as r

def main():
    os.system("cls")
    nf = 5
    nc = 5
    matriz = []
    for i in range(nf):
        fila = []
        for j in range(nc):
            valor = r.randint(1,6)
            fila.append(valor)
        matriz.append(fila)

    print(matriz)
    if nf == nc:
        diagonal = []
        for i in range(nf):
            for j in range(nc):
                if i == j:
                    diagonal.append(matriz[i][j])
        minimo = min(diagonal)
        maximo = max(diagonal)
        promedio = sum(diagonal) / len(diagonal)
        print("Diagonal: ", diagonal)
        print(f"El promedio de la diagonal es: {promedio}")
        print(f"El min de la diagonal es: {minimo}")
        print(f"El max de la diagonal es: {maximo}")
    else : 
        print("Matriz no cuadrada")


    
          
if __name__ == "__main__":
   main()