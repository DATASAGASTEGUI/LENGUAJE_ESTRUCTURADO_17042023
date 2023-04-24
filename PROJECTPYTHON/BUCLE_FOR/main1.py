# SERIE NATURAL 1...N
import os

os.system('cls')
n = int(input('Ingrese N? '))

print("EJEMPLO 1")
for i in range(n): # i < n   range(0,n,1)
    print(i, end='  ')

print("\n")

print('EJEMPLO 2')
for i in range(1,n+1,1): #inicio, hasta menor, incremento 
    print(i, end='  ')

print("\n")

print('EJEMPLO 3')
for i in range(1,n,1): 
    print(i, end='  ')
print(n)

print('EJEMPLO 4')
for i in range(n,0,-1):
    print(i, end='  ')