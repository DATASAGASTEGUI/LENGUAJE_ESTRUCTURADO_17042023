import os

def ejemplo1():
    alumno = {'idAlumno':'A1',
              'nombre':'Luis',
              'edad': 23,
              'estatura': 1.72,
              'casado': False}
    for clave in alumno:
        print(clave,alumno[clave])

    print()

    for clave in alumno:
        valor = alumno[clave]
        print('%-10s %5s %-10s' % (clave, ":", valor))

def ejemplo1_1():
    idAlumno = input('Ingrese id alumno? ')
    nombre = input('Ingrese nombre? ')
    edad = int(input('Ingrese edad? '))

    alumno = {'idAlumno':idAlumno,
              'nombre':nombre,
              'edad':edad}
    
    for clave in alumno:
        print('%-12s %-12s' % (clave,alumno[clave]))
    
def ejemplo2():
    fruta = {1:'Manzana',2:'Naranja',3:'Uva',1:'Fresa'}
    for clave in fruta:
        print('%-12s %-12s' % (clave,fruta[clave]))

def ejemplo3():
    fruta = {('Manzana','Roja'):5,
             ('Manzana','Amarilla'):7,
             ('Naranja','Mesa'):10,
             ('Naranja','Zumo'):9,
             ('Platano','Manzano'):5,
             ('Platano','Isla'):3,
             'Uva': 6,
             ('Manzana',True):19,
             'Asignaturas':['Física','Química']}
    
    for clave in fruta:
        print('%-25s %12s' % (clave,fruta[clave]))
        
   


if __name__ == "__main__":
   os.system('cls')
   ejemplo3()