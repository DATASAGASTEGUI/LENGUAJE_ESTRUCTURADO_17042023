# IF - THEN - ELSE

import os

os.system('cls')
'''
#EVALUAR UNA NOTA COMO APROBADO O DESAPROBADO SIN ELSE

nota = 2

evaluar = 'Desaprobado'
if nota >= 5:
   evaluar = 'Aprobado'
print(evaluar)

#EVALUAR UNA NOTA COMO APROBADO O DESAPROBADO CON ELSE

if nota >= 5:
   print("Aprobado")
else:
   print('Desaprobado')
'''
#  EVALUAR UNA NOTA DESAPROBADO(MENOR 5), SUFICIENTE(5,7), NOTABLE(8,10),
#  SI NO ESTA EN RANGO NOTA NO VALIDA
#  0    4     5    7    8   10

nota = 9

if nota >= 0 and nota < 5:
   print("Desaprobado")
else:
   if nota>=5 and nota<=7:
      print("Suficiente")
   else:
      if nota>=8 and nota<=10:
         print("Notable")
      else:
         print("Nota no valida")

'''
nota=20
if(nota >-1 and nota<5):
    mensaje="Suspenso"
elif(nota>4 and nota<7):
   mensaje="Suficiente"
elif(nota>8 and nota<10):
   mensaje="Notable"
elif(nota==10):
   mensaje="Sobresaliente"
else:
   mensaje="Nota no valida"

print("Su nota es",mensaje)
'''

