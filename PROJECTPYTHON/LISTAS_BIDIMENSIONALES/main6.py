import os
import random as r

def repetido(numero,vector):
    respuesta = False
    for e in vector:
        if e == numero:
            respuesta = True
    return respuesta

def main():
    os.system("cls")
    nf = 3
    nc = 3
    matriz = []
    apariciones = [9]
    for i in range(nf):
        fila = []
        for j in range(nc):
            valor = r.randint(1,20)
            while repetido(valor,apariciones):
                valor = r.randint(1,20)
            apariciones.append(valor)
            fila.append(valor)
        matriz.append(fila)

    print(matriz)



    
          
if __name__ == "__main__":
   main()