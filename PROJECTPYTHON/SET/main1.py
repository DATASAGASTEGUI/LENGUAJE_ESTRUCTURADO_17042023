import os

def ejemplo1():
    c1 = {4, 2, 1, 0, 0, 0}
    c2 = {"Luis".lower(),"Carlos","Luis".lower(),"luis"}
    print(c1)
    print(c2)
    print(type(c1))

def ejemplo2():
    lista = [1, 1, 1, 2, 1, 3, 4, 2]
    lista1 =  list(set(lista))
    print(lista)
    print(lista1)
    print(type(lista1))

def ejemplo3():
    lista = [4, 5, 1, 3, 3]
    conjunto = {*lista}
    print(conjunto)

def ejemplo4():
    lista = [4, 5, 1, 3, 3]
    conjunto = set()
    for e in lista:
        conjunto.add(e)
    print(conjunto)
    print("Longitud: ", len(conjunto))

if __name__ == "__main__":
   os.system('cls')
   ejemplo4()