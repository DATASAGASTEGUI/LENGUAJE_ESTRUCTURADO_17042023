import os

def interseccion():
    a = {1,2,3,4}
    b = {1,2,5,6}
    c = a & b
    print('Intersección: ', c)

def union():
    a = {1,2,3,4}
    b = {1,2,5,6}
    c = a | b
    print('Unión: ', c) 

def diferencia():
    a = {1,2,3,4}
    b = {1,2,5,6}
    c = a - b
    print('Diferencia: ', c) 

def inclusion():
    a = {1, 2}
    b = {1, 2, 3, 4}
    c = b >= a    
    print('Inclusión: ', c)

    a = {5, 6, 1}
    b = {1, 2, 3, 4}
    c = b >= a    
    print('Inclusión: ', c)

def disjuntos():
    a = {1, 2}
    b = {3, 4}
    c = a.isdisjoint(b)
    print('Disjuntos: ', c)

    a = {1, 3}
    b = {3, 4}
    c = a.isdisjoint(b)
    print('Disjuntos: ', c)

if __name__ == "__main__":
    os.system('cls')
    interseccion()
    union()
    diferencia()
    inclusion()
    disjuntos()