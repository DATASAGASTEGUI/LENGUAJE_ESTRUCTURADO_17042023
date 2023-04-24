Algoritmo ArbolDecisionGato
	//DEFINIR DATOS
	Definir p1,p2,p3 Como Logico
	//ETRADA - PROCESO - SALIDA
	Escribir "P1 - ¿Tiene 4 patas?"
	Leer p1
	Si p1 = Verdadero Entonces
		Escribir "P2 - ¿Tiene Orejas Redondas?"
		Leer p2
		Si p2 = Verdadero Entonces
			Escribir "No es un Gato"
		SiNo
			Escribir "P3 - ¿Tiene Bigotes?"
			Leer p3
			Si p3 = Verdadero Entonces
				Escribir "Es un Gato"
			SiNo
				Escribir "No es un Gato"
			FinSi
		FinSi
	SiNo
		Escribir "No es un gato"
	FinSi
FinAlgoritmo
