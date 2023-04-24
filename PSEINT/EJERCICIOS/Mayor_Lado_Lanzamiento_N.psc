Algoritmo Mayor_Lado_Lanzamiento_N
	//DEFINIR DATOS
	Definir i,n,x Como Entero
	//ENTRADA
	Escribir "Ingrese número lanzamientos dado? "
	Leer n
	Para i<-1 Hasta n Con Paso 1 Hacer
		x = Aleatorio(1,6)
		Escribir x
		Si x = 1
			c1 = c1 + 1
		FinSi
		Si x = 2
			c2 = c2 + 1
		FinSi
		Si x = 3
			c3 = c3 + 1
		FinSi
		Si x = 4
			c4 = c4 + 1
		FinSi
		Si x = 5
			c5 = c5 + 1
		FinSi
		Si x = 6
			c6 = c6 + 1
		FinSi
	Fin Para
	Escribir "Lado 1: ", c1
	Escribir "Lado 2: ", c2
	Escribir "Lado 3: ", c3
	Escribir "Lado 4: ", c4
	Escribir "Lado 5: ", c5
	Escribir "Lado 6: ", c6
	mayor = c1
	lado = 1
	Si c2 >= mayor
		mayor = c2
		lado = 2
	FinSi
	Si c3 >= mayor
		mayor = c3
		lado = 3
	FinSi
	Si c4 >= mayor
		mayor = c4
		lado = 4
	FinSi
	Si c5 >= mayor 
		mayor = c5
		lado = 5
	FinSi
	Si c6 >= mayor
		mayor = c6
		lado = 6
	FinSi
	
	//LADOS MAYORES
	Si c1 = mayor
		Escribir "Lado Mayor: ", 1
	FinSi
	Si c2 = mayor
		Escribir "Lado Mayor: ", 2
	FinSi
	Si c3 = mayor
		Escribir "Lado Mayor: ", 3
	FinSi
	Si c4 = mayor
		Escribir "Lado Mayor: ", 4
	FinSi
	Si c5 = mayor
		Escribir "Lado Mayor: ", 5
	FinSi
	Si c6 = mayor
		Escribir "Lado Mayor: ", 6
	FinSi	
FinAlgoritmo
