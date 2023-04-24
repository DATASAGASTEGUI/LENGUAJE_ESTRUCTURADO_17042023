import os

def ejemplo1():
    alumno = {'idAlumno':'A1',
              'nombre':'Luis'}
    
    alumno['ciudad'] = 'Madrid' #  'ciudad':'Madrid'

    print(alumno)

def ejemplo2():
    meses = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto',
             'Septiembre','Octubre','Noviembre','Diciembre']
    
    mesesd = {}
    for i in range(len(meses)):
        mesesd[i] = meses[i]
    print(mesesd)

def ejemplo2_1():
    meses = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto',
             'Septiembre','Octubre','Noviembre','Diciembre']
    mesesd = {}
    for k,v in zip(meses,range(len(meses))):
        mesesd[v] = k
    print(mesesd)

    
    
    # Crear un diccionario cuyos elementos tienen el siguiente formato:
    # 0:Enero   clave=Posición del mes 
    #           valor=Mes que ocupa la posición

if __name__ == "__main__":
   os.system('cls')
   ejemplo1()
   ejemplo2_1()