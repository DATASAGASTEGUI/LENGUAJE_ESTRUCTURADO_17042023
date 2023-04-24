import os

def pintarguiones(cadena):
    s = ''
    for i in range(len(cadena)):
        s = s + '-'
    return s

def solucion():
    datos_clientes = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    lista = datos_clientes.split('\n')
    cuerpo = lista[1].split(';')
    cuerpo1 = lista[2].split(";")
    cuerpo2 = lista[2].split(";")
    cuerpo3 = lista[3].split(";")
    cuerpo4 = lista[4].split(";")
    cabecera= lista[0].split(";")

    print('%-11s %-21s %-30s %-9s %11s' % (cabecera[0],cabecera[1],cabecera[2],cabecera[3],cabecera[4]))
    print('%-11s %-21s %-30s %-8s %11s' % (pintarguiones(cabecera[0]),pintarguiones(cabecera[1]),pintarguiones(cabecera[2]),pintarguiones(cabecera[3]),pintarguiones(cabecera[4])))
    print('%-11s %-21s %-30s %-11s %-6s' % (cuerpo[0],cuerpo[1],cuerpo[2],cuerpo[3],cuerpo[4]))
    print('%-11s %-21s %-30s %-11s %-6s' % (cuerpo1[0],cuerpo1[1],cuerpo1[2],cuerpo1[3],cuerpo1[4]))
    print('%-11s %-21s %-30s %-11s %-6s' % (cuerpo2[0],cuerpo2[1],cuerpo2[2],cuerpo2[3],cuerpo2[4]))
    print('%-11s %-21s %-30s %-11s %-6s' % (cuerpo3[0],cuerpo3[1],cuerpo3[2],cuerpo3[3],cuerpo3[4]))
    print('%-11s %-21s %-30s %-11s %-6s' % (cuerpo4[0],cuerpo4[1],cuerpo4[2],cuerpo4[3],cuerpo4[4]))    
    print(datos_clientes)

def otraforma():
    datos_clientes = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    filas = datos_clientes.split('\n')
    columnas = filas[0].split(';')

    print('%-11s %-21s %-30s %-9s %11s' % (columnas[0],columnas[1],columnas[2],columnas[3],columnas[4]))
    print('%-11s %-21s %-30s %-8s %11s' % ("---","------","-----","--------","--------"))
    
    for fila in filas[1:]:
        datos = fila.split(';')
        print('%-11s %-21s %-30s %-9s %11s' % (datos[0],datos[1],datos[2],datos[3],datos[4]))
        print()

def ejemplo1():
    datos_clientes = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    filas = datos_clientes.split('\n')
    encabezados = filas[0].split(';')   

    datosd = {}

    for fila in filas[1:]:
        datos = fila.split(';')
        nif = datos[0]

        cliented = {}

        for i in range(1,len(encabezados)):
            cliented[encabezados[i]] = datos[i]
        datosd[nif] = cliented 

    for clave in datosd:
        valor = datosd[clave]
        print(clave,";",valor)
print()    

def main():
    os.system("cls")
    #solucion()
    #otraforma()
    ejemplo1()
          
if __name__ == "__main__":
   main()