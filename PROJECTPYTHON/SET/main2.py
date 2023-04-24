import os

def ejemplo1():
    conjunto = {2, 3, 5, 1}
    print(conjunto)
    conjunto.remove(5)
    print(conjunto)

def ejemplo2():
    conjunto = {2, 3, 5, 1}
    print(conjunto)
    conjunto.clear()
    print(conjunto)

def ejemplo3():
    conjunto = {2, 3, 5, 1}
    for i in range(len(conjunto)):
        conjunto.pop()
    print(conjunto)

def ejemplo4():
    conjunto = {2, 3, 5, 1}
    if 5 in conjunto:
       print('SI')
       conjunto.remove(5)
    else:
       print('NO')


if __name__ == "__main__":
   os.system('cls')
   ejemplo4()