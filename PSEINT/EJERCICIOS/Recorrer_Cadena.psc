Algoritmo Recorrer_Cadena
	//DEFINIR DATOS
	Definir tex Como Caracter
	Definir i Como Entero
	//ENTRADA
	Escribir "Ingrese un texto? "
	Leer tex
	//PROCESO - SALIDA
	Para i<-1 Hasta Longitud(tex) Con Paso 1 Hacer
		Escribir Subcadena(tex,i,i)
	Fin Para
FinAlgoritmo
