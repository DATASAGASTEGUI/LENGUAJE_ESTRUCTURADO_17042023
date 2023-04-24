Algoritmo Recorrer_Cadena_Invertida
	//DEFINIR DATOS
	Definir tex Como Caracter
	Definir i Como Entero
	//ENTRADA
	Escribir "Ingrese un texto? "
	Leer tex
	//PROCESO - SALIDA
	Para i<-Longitud(tex) Hasta 1 Con Paso -1 Hacer
		Escribir Subcadena(tex,i,i)
	Fin Para
FinAlgoritmo
