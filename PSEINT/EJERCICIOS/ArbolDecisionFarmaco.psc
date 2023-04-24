Algoritmo ArbolDecisionFarmaco
	Definir p1,p2,p3 Como Caracter
	Definir salir Como Logico
	
	salir=falso
	Repetir
		salir=falso
		Escribir "P1 - Presión Arterial (A=Alta,M=Media,B=Baja)?"
		Leer p1
		Si p1 = "A" Entonces
			Escribir "P3 - Azucar en sangre(A=Alto,B=Bajo)? "
			Leer p3
			Si p3="A" O p3="B" Entonces
				Si p3="B" Entonces 
					Escribir "Si puede tomar farmaco F"
				SiNo
					Escribir "P4 - Alergia Antibioticos(S=Si,N=No)? "
					Leer p4
					Si p4 = "S" O p4 ="N"
						Si p4 = "S" Entonces
							Escribir "P5 - Otras Alergias(S=Si,N=No)? "
							Leer p5
							Si p5 = "S" O p5 = "N" Entonces
								Si p5 = "S" Entonces
									Escribir "No puede tomar farmaco F"
								SiNo
									Escribir "Si puede tomar farmaco F"
								FinSi
							SiNo
								Escribir "ENTRADA INCORRECTA"
								salir=Verdadero
							FinSi
						SiNo
							Escribir "Si se puede tomar farmaco F"
						FinSi
					SiNo
						Escribir "ENTRADA INCORRECTA"
						salir=Verdadero
					FinSi
				FinSi
			SiNo
				Escribir "ENTRADA INCORRECTA"
				salir=Verdadero
			FinSi
		FinSi
		
		Si p1 = "M" Entonces
			Escribir "P2 - Indice de Colesterol(A=Alto,B=Bajo)? "
			Leer p2
			Si p2 = "A" O p2 = "B" Entonces
				Si p2 = "B" Entonces
					Escribir "Si puede tomar el farmaco F"
				SiNo
					Escribir "No puede tomar el farmaco F"
				FinSi
			SiNo
				Escribir "ENTRADA INCORRECTA"
				salir=Verdadero
			FinSi
		FinSi
		
		Si p1 = "B" Entonces
			Escribir "Si puede tomar farmaco F"
		FinSi
		
		Si p1 <> "A" Y p1 <> "B" Y p1 <> "M" Entonces
			Escribir "ENTRADA INCORRECTA"
			salir=Verdadero
		FinSi
	Hasta Que salir=falso
FinAlgoritmo
