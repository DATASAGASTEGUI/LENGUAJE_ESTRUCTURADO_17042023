Algoritmo SegundosAHorasMinutosParImparAleatorio
	//DEFINIR DATOS
	Definir cantidad_segundos, horas, minutos, resto1, resto2 Como Entero
	//PROCESO
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		cantidad_segundos = Aleatorio(3600,10000)
		
		Si cantidad_segundos % 2 = 0
			resultado = "PAR"
		SiNo
			resultado = "IMPAR"
		FinSi
		
		horas = TRUNC(cantidad_segundos / 3600)
		resto1 = cantidad_segundos % 3600
		
		minutos =  TRUNC(resto1 / 60)
		resto2 = resto1 % 60 //SEGUNDOS
		//SALIDA
		Escribir i,")",cantidad_segundos, "  ", "Horas : ", horas, "  ", "Minutos : ", minutos, "  ", "Segundos : ", resto2, "  ", resultado
	Fin Para
FinAlgoritmo
