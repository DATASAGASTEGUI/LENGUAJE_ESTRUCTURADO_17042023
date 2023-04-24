****************************
***   ACERCA DE PYTHON   ***
****************************

•	Python fue creado por Guido van Rossum en el año 1991. Fue durante ese año que se lanzó la primera versión pública de Python, conocida como Python 0.9.0.
•	Python es un lenguaje de programación de propósito general, poderoso, flexible, sencillo y fácil de aprender.
•	Es un lenguaje de alto nivel.
•	Es relativamente joven (Fortran 1957, Pascal 1970, C 1972, Modula-2 1978, Java 1991).
•	Es software libre, y está implementado en todas las plataformas y sistemas operativos habituales.
•	La Python Software Foundation (PSF) es una corporación sin fines de lucro que posee los derechos de propiedad intelectual detrás del lenguaje de programación Python. Administramos las licencias de código abierto.
•	Python se desarrolla bajo una licencia de Open source o código abierto aprobada por OSI, por lo que se puede usar y distribuir libremente, incluso para uso comercial.
    Lenguaje de debilimente tipeado o tipo dinámico.

*******************************
***   EJECUCION DE PYTHON   ***
*******************************

Python es comúnmente conocido como un lenguaje de programación interpretado. Esto significa que el código fuente de Python se ejecuta directamente por un intérprete, línea por línea, en tiempo de ejecución sin requerir un paso previo de compilación. El intérprete de Python lee el código fuente, lo traduce a instrucciones ejecutables y las ejecuta en ese momento.

Sin embargo, es importante destacar que Python utiliza una implementación llamada CPython, que combina interpretación y compilación. Cuando ejecutas un programa Python, CPython compila el código fuente a un formato intermedio llamado "bytecode" utilizando un compilador interno. Luego, el bytecode se ejecuta en el intérprete de Python.

Esto significa que el código fuente de Python no se compila directamente a código máquina, como ocurre en lenguajes completamente compilados como C o C++. En cambio, se realiza una compilación en tiempo de ejecución a bytecode, que luego se interpreta y ejecuta.

*********************************
***   INSTALACION DE PYTHON   ***
*********************************

La descarga del instalador de python se hace de la siguiente url https://www.python.org/downloads/ 
La descarga del IDE Visual Studio Code para trabajar con python, se hace de la siguiente url https://code.visualstudio.com/      

**************************
***   TIPOS DE DATOS   ***
**************************

•	Tipos de datos básicos.

Entero		                (int)
Real(Punto Flotante)		(float)
Cadena		                (str)
Lógico		                (bool) False, True
Carácter	                (bytes)

**********************************
***   OPERADORES ARITMETICOS   ***
**********************************

+	Suma
-	Resta
*	Multiplicación
/	División normal (Punto Flotante)
//	División con redondeo hacia abajo (cociente entero de una división entre enteros)
%	Módulo(Residuo de una división)
**	Exponensial

******************************
***   OPERADORES LOGICOS   ***
******************************

Conjución            : and  (Es verdadero cuando ambos son verdaderos)
Disyunción inclusivo : or   (Es falso cuando ambos son falsos)  
Disyunción exclusivo : ^    (Es verdadero cuando uno de los dos es verdadero pero no ambos)
Negación             : not  (Si es verdadero al negarse cambia a falso y si es falso al negarse cambia a verdadero)

*******************************
***   OPERADOR ASIGNACION   ***
*******************************

=	Asignación
+=	Suma y asignación (a = a + t)
-=	Resta y asignación (a = a - t)
*=	Multiplicación y asignación (a = a * t)
/=	División y asignación (a = a / t)
%=	Módulo(Residuo de una división) y asignación (a = a % t)
//=	División y asignación (a = a // t)
**=	Exponencial y asignación (a = a ** t)

•	Asignar un valor a una variable. 

a = 1

•	Asignar un valor a múltiples variables.

a = b = c = 1  # Inicializa a, b y c con el valor 1

•	Asignar múltiples valores a múltiples variables

a, b, c = 1, 2, 3

*************************************
***   OPERADORES DE COMPARACION   ***
*************************************

==       Igual que
!= ó <>  Distinto que
<        Menor que
<=       Menor o igual que
>        Mayor que
>=       Mayor o igual que

*********************************
***   OPERADORES ESPECIALES   ***
*********************************

(1)

is       Es True si los operadores son idénticos
is not   Es True si los operadores no son idénticos
in       Es True si el valor o variable se encuentra en la secuencia
not in   Es True si el valor o variable no se encuentra en la secuencia

(2)

a = 4
b = 1
c = 10
d = [1, 2, 3, 4, 5]

valor_logico = c is c     --> True
valor_logico = a is b     --> False
valor_logico = c is not c --> False
valor_logico = a is not b --> True
valor_logico = a in d     --> True
valor_logico = c in d     --> False
valor_logico = a not in d --> False
valor_logico = c not in d --> True

*******************************
***   ENTRADA POR TECLADO   ***
*******************************

SALIDA DEL MENSAJE Y ENTRADA DEL DATO JUNTOS EN LA MISMA LINEA

(1*) 2.7
a = int(input("Ingrese a? "))
b = int(input("Ingrese b? "))
(2) 3.1
print("Ingrese a = ", end=""); a = int(input())
print("Ingrese b = ", end=""); b = int(input())
(3) 2.7
print("Ingrese a? "),
a = int(input())
print("Ingrese b? "),
b = int(input())

TIPO ENTERO

edad = int(input("Ingrese su edad? "))
print(str(edad) + " es tipo " + str(type(edad)))         # 48 es tipo <class 'int'>

TIPO REAL

estatura = float(input("Ingrese su estatura? "))         # 1.72
print(str(estatura) + " es tipo " + str(type(estatura))) # 1.72 es tipo <class 'float'>

TIPO LOGICO

casado = bool(input("Ingrese su estado civil? "))        # True ó 1
print(str(casado) + " es tipo " + str(type(casado)))     # True es tipo <class 'bool'>

TIPO CARACTER (NOTA 2)

(1) 3.1
sexo = input("Ingrese su sexo? ")                        # M 
print(sexo + " es tipo " + str(type(sexo)))              # M es tipo <class 'str'>
(2*) 2.7
sexo = raw_input("Ingrese su sexo? ")                    # M
print(sexo + " es tipo " + str(type(sexo)))              # M es tipo <class 'str'>
(3) 2.7
import sys
sys.stdout.write("Ingrese su sexo? ")
sys.stdout.flush()
sexo = sys.stdin.read(1)                                 # M
print(sexo + " es tipo " + str(type(sexo)))              # M es tipo <class 'str'>
(4) 3.1
import msvcrt
print("Ingrese su sexo? ", end="", flush=True)
sexo = msvcrt.getche() # Con eco
sexo = msvcrt.getch()  # Sin eco
print("")                                                                 # M
print(str(sexo.decode("windows-1252")) + " es tipo " + str(type(sexo)))   # M es tipo <class 'bytes'>

TIPO CADENA

(1) 3.1
nombre = input("Ingrese su nombre? ")                    # Walter
print(nombre + " es tipo " + str(type(nombre)))          # Walter es tipo <class 'str'>
(2*) 2.7
nombre = raw_input("Ingrese su nombre? ")                # Walter
print(nombre + " es tipo " + str(type(nombre)))          # Walter es tipo <class 'str'>

NOTAS

(1) Todo lo que ingresemos por teclado(input) es de tipo cadena.
(2) El valor de tipo caracter es un tipo cadena de un solo caracter.
(3) x = b'Z'
    print(str(x) + " es tipo " + str(type(x))) # b'Z' es tipo <class 'bytes'>

    x = b'Z'.decode("windows-1252")
    print(x + " es tipo " + str(type(x))) # Z es tipo <class 'str'>

    x = 'Z'
    print(x + " es tipo " + str(type(x))) # Z es tipo <class 'str'>

    x = chr(90)
    print(x + " es tipo " + str(type(x))) # Z es tipo <class 'str'>







Confeccionar un programa que pida por teclado 3 notas de 3 alumnos diferentes, calcular el promedio e imprimir por pantalla alguno de los siguientes mensajes.

Si el promedio es mayor o igual a 7, mostrar “Promocionado”

Si el promedio es mayor o igual a 4 y menor que 7, mostrar “Regular”

Si el promedio es menor que 4, mostrar “Suspendido”










Linter pylint 
Python Linting, Debugging (multi-threaded
Archivo > Autoguardado




C:\CURSOS\OTROS\PROJECTSPYTHON\PYTHON_0001>C:/Python310/python.exe main.py

Hola Mundo

C:\CURSOS\OTROS\PROJECTSPYTHON\PYTHON_0001>C:/Python310/python.exe main.txt

Hola Mundo

C:\CURSOS\OTROS\PROJECTSPYTHON\PYTHON_0001>python --version  

Python 3.10.4

C:\Python310\python.exe -m pip install --upgrade pip

C:\WINDOWS\system32>pip install keras

 

