import os

os.system('cls')

# INVERTIR UN NUMERO DE DOS DIGITOS

n = 45
c = n // 10 #División Entera
r = n % 10  #Residuo
invertir = r * 10 + c

print("Cociente: ", c) # 2
print("Residuo : ", r) # 3
print("Invertir: ", invertir)

os.system('pause')
