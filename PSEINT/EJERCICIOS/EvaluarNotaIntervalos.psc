Algoritmo EvaluarNotaIntervalos
	//Definir datos
	Definir a Como Real
	//Entrada
	Escribir "Escribe la nota: "
	Leer a
	//Proceso 
	Si a<0 O a>10
		Escribir "Nota no valida"
	FinSi
	Si a>=0 Y a<5
		Escribir "Insuficiente"
	FinSi
	Si a>=5 Y a<6
		Escribir "Suficiente"
	FinSi
	Si a>=6 Y a<7
		Escribir "Bien"
	FinSi
	Si a>=7 Y a<=8
		Escribir "Notable"
	FinSi
	Si a>=9 Y a<=10
		Escribir "Sobresaliente"
	FinSi
FinAlgoritmo
