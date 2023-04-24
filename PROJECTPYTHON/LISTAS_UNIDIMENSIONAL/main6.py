import os

if __name__ == "__main__":
    os.system('cls')
    codigo = [1, 2, 3, 4, 5]
    nombre = ['Luis', 'Miguel', 'Carlos', 'Arturo', 'Carmen']
    edad = [21, 23, 24, 18, 17]
    estatura = [1.72, 1.65, 1.58, 1.45, 1.23]
    casado = [True, False, True, True, False]

    print('%6s  %-6s  %4s  %8s  %-6s' % ('CODIGO','NOMBRE','EDAD','ESTATURA','CASADO'))
    print('%6s  %-6s  %4s  %8s  %-6s' % ('------','------','----','--------','------'))

    for i in range(len(codigo)):
        print('%6d  %-6s  %4d  %8.2f  %-6s' % (codigo[i],nombre[i],edad[i],estatura[i],casado[i]))