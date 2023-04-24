import os

def ejemplo1():
    alumno = {'idAlumno':'A1',
              'nombre':'Luis',
              'edad': 23,
              'estatura': 1.72,
              'casado': False}
    
    clave = input('Ingrese la clave? ')
    valor = alumno.get(clave)
    if valor != None:
       print(clave, ":", valor)
    else:
       print('NO EXISTE CLAVE')

def ejemplo2():
    alumno = {'idAlumno':'A1',
              'nombre':'Luis',
              'edad': 23,
              'estatura': 1.72,
              'casado': False,
              'Asignaturas':['Física','Química','Matemática']}
    # Hay que buscar si el alumno cursa la asignatura de Química.
    asignatura = input("Ingrese asignatura cursada: ") #Química
    valor_lista = alumno["Asignaturas"]
    if asignatura in valor_lista:
       print("si")
    else:
       print("no")


if __name__ == "__main__":
   os.system('cls')
   ejemplo2()