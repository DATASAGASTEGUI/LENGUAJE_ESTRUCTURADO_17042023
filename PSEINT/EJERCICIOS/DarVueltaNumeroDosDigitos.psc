Algoritmo DarVueltaNumeroDosDigitos
	//DEFINIR DATOS
	Definir x,cociente,residuo,resultado Como Entero
	//ENTRADA
	Escribir 'Escribe un valor de dos digitos: '
	Leer x
	//PROCESO 
	cociente <- trunc(x/10)
	residuo <- x%10
	resultado <- (residuo*10)+cociente
	//SALIDA
	Escribir 'El número invertido es: ',resultado
FinAlgoritmo
