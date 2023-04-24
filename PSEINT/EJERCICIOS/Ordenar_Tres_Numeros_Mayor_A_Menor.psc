Algoritmo Ordenar_Tres_Numeros_Mayor_A_Menor
	//DEFINR DATOS
	Definir a,b,c,pro Como Entero
	Definir resultado Como Caracter
	//ENTRADA
	Escribir Sin Saltar "Ingrese nota 1? "
	Leer a
	Escribir Sin Saltar "Ingrese nota 2? "
	Leer b
	Escribir Sin Saltar "Ingrese nota 3? "
	Leer c
	//PROCESO
	pro = (a+b+c)/3
	
    Si a>=b Y b>=c 
			resultado = ConvertirATexto(a) + "  " + ConvertirATexto(b) + "  " + ConvertirATexto(c)
    FinSi
	Si a>=c Y c>=b
			resultado = ConvertirATexto(a) + "  " + ConvertirATexto(c) + "  " + ConvertirATexto(b)
	FinSi
	Si b>=a Y a>=c
			resultado = ConvertirATexto(b) + "  " + ConvertirATexto(a) + "  " +ConvertirATexto(c)
	FinSi
	Si b>=c Y c>=a
			resultado = ConvertirATexto(b) + "  " + ConvertirATexto(c) + "  " + ConvertirATexto(a)
	FinSi
	Si c>=a Y a>=b
			resultado = ConvertirATexto(c) + "  " + ConvertirATexto(a) + "  " + ConvertirATexto(b)
	FinSi
	Si c>=b Y b>=a
			resultado = ConvertirATexto(c) + "  " + ConvertirATexto(b) + "  " + ConvertirATexto(a)
	FinSi
	//SALIDA	
	Escribir "Promedio: ", pro
	Escribir "Ordenado Mayor a Menor: ", resultado
		
FinAlgoritmo
