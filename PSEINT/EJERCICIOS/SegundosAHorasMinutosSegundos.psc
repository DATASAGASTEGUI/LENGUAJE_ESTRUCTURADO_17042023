Algoritmo SegundosAHorasMinutosSegundos
	//DEFINIR DATOS
	Definir cantidad_segundos, horas, minutos, resto1, resto2 Como Entero
	//ENTRADA
	Escribir "Ingresar cantidad en segundos? "
	Leer cantidad_segundos
	//PROCESO
	//1 HORA = 60 minutos = 60 * 60 = 3600 SEGUNDOS
	//1 MINUTOS = 60 SEGUNDOS
	horas = TRUNC(cantidad_segundos / 3600)
	resto1 = cantidad_segundos % 3600
	
	minutos =  TRUNC(resto1 / 60)
	resto2 = resto1 % 60 //SEGUNDOS
	//SALIDA
	Escribir "Horas    : ", horas
	Escribir "Minutos  : ", minutos
	Escribir "Segundos : ", resto2
	
FinAlgoritmo
