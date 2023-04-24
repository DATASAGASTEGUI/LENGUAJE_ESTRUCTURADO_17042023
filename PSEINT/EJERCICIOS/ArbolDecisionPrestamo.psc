Algoritmo Ejercicio_0084
	Definir im Como Entero
	Definir a Como Real
	Definir ap,tc Como Logico
	Escribir Sin Saltar "Ingresos Mensuales? "
	Leer im
	Si im < 1500 Entonces
		Escribir Sin Saltar"Antedecentes Penales? "
		Leer ap
		Si ap = Verdadero
			Escribir "No Ofrecer Prestamo X"
		SiNo
			Escribir Sin Saltar "Años en el Empleo Actual? "
			Leer a
			Si a >= 1
				Escribir "Ofrecer Pr�stamo Y"
			SiNo
				Escribir Sin Saltar "Realiza pagos con la tarjeta de cr�dito? "
				Leer tc
				Si tc = Verdadero
					Escribir "Ofrecer Pr�stamo Y"
				SiNo
					Escribir "No Ofrecer Pr�stamo X"
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir Sin Saltar"Años en el empleo actual? "
		Leer a
		Si a >= 1
			Escribir "Ofrecer Préstamo X"
		SiNo
			Escribir "No Ofrecer Préstamo Y"
		FinSi
	FinSi
FinAlgoritmo