<h1>QUE ES POWERSHELL</h1>

- Windows PowerShell es un lenguaje de secuencias de comandos y un motor de automatización orientado a objetos. Está diseñado principalmente para administradores de sistemas, los profesionales lo utilizan para controlar y automatizar la administración del sistema operativo Windows y otras aplicaciones.

<h1>CUATRO NIVELES DE PERMISIVIDAD DE POWERSHELL</h1>

Restricted: En este nivel no se permite la ejecución de scripts. Es decir PowerShell sólo pude
            utilizarse en modo interactivo. Esta es la opción predeterminada.

AllSigned: Cuando esta sea la opción elegida, deberán estar autenticados todos los scripts, antes
           de poder ejecutarlos. Es la opción más restrictiva.
		   
RemoteSigned: En este caso, sólo deberán estar auteticados los scripts que procedan de una ubitación
              remota. Por ejemplo, los que hayas descargados o creado yo mismo.
			  
Unrestricted: Si elegimos esta opción, se ejecutará cualquier script sin importar su origen. Se trata de la opción
              menos recomendada.
			  
<h1>CAMBIAR LA PERMISIVIDAD DE POWERSHELL</h1>
	
- Para saber qué política tenemos actualmente, en mi caso me sale como respuesta "Restricted" que la que esta por defecto
  en el sieguite comando lo cambio.

Get-ExecutionPolicy

- Para cambiar la política, siempre ejecutando PowerShell como administrador, pongo 2 ejemplos en mi caso uso Unrestricted
  es la mas peligrosa porque deja abierta la posibilidad que si alguien nos envia un script malicioso este se ejecute pero
  en mi caso lo uso para hacer pruebas y luego lo vuelvo a la que tiene por defecto Restricted, pero recomiendo la primera
  RemoteSigned es decir permite ejecutar los script que yo creo.

Set-ExecutionPolicy RemoteSigned

ó

Set-ExecutionPolicy Unrestricted

<h1>RESUMEN DEL LENGUAJE</h1>

<h3>RUTA DONDE ESTA LA APLICACION POWERSHELL</h3>

<pre><code>
C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe
C:\Windows\System32\WindowsPowerShell\v1.0\powershell.exe
</pre></code>

<h3>GESTIONAR FICHEROS Y DIRECTORIOS</h3>

- Listar todos los archivos y directorios localizados en en la raiz de la unidad c incluidos los ocultos y del sistema
  con el parametro -Force

Get-ChildItem -Force C:\

- Igual al anterior pero incluyendo el de los subdirectorios con el parametro -Recurse

Get-ChildItem -Force c:\ -Recurse
Get-ChildItem -Path c:\DESTINO -Recurse

- Listar todos los ficheros .avi contenidos en nuestra carpeta de usuario, que hayan sido
  modificados en 2016 y que tengan un tamaño mayor de 1mb y menor de 10mb
 
<pre><code> 
Get-ChildItem -Path $env:HOMEPATH -Recurse -Include *.mp4 | Where-Object -FilterScript {($_.LastWriteTime -gt "2016-01-01") -and ($_.Length -ge 1mb) -and ($_.Length -le 10mb)}

Nota:

$env:HOMEPATH ---> \Users\datas  ---> Ruta del usuario que ingreso al sistema
LastWriteTime ---> Fecha ultima que se modifico el archivo
</pre></code>

- Copiar un archivo hacia un directorio

Copy-Item -Path c:\ejemplo.txt -Destination c:\backup

- Force para forzar la sobreescritura en caso que en el destino existiese un archivo con el mismo nombre,
  esta opción funciona incluso cuando el directorio de destino es solo de lectura.
  
Copy-Item -Path c:\ejemplo.txt -Destination c:\backup\ejemplocopia.txt -Force

- Copiar directorios completos el comando es el mismo, utilizando un parámetro que hemos visto antes, “Recurse” para copiar todos los subdirectorios.

Copy-Item -Path c:\ORIGEN -Recurse c:\DESTINO 

Nota:

El resultado sería c:\DESTINO\ORIGEN es decir toda la carpeta ORIGEN incluido sus subcarpetas y archivos estarían dentro de la carpeta DESTINO

Copy-Item c:\ORIGEN\* -Destination c:\DESTINO -Recurse

Nota:

El resultado sería c:\DESTINO\CARPETA es decir todas las carpetas y archivos dentro de la carpeta ORIGEN incluido sus subcarpetas y archivos estarían dentro de la carpeta DESTINO pero no existe la carpeta ORIGEN sino todo lo que esta dentro de ORIGEN

- Copiar solo los archivos .mp3

Copy-Item -Filter *.mp3 -Path c:\ORIGEN -Recurse -Destination c:\DESTINO

- Copiar varias carpetas usando PowerShell

Copy-Item c:\ORIGEN1\*,c:\ORIGEN2\*,c:\ORIGEN3\* -Destination c:\DESTINO -Recurse

- Listar el contenido de una ruta recursivamente muestre carpetas y archivos

ls c:\ORIGEN -Recurse
ls c:\ORIGEN\*x*.txt -Recurse
ls c:\ORIGEN\c*.* -Recurse

- Eliminar todos los archivos, carpetas dada y subcarpetas de una ruta determinada

Remove-Item –Path c:\DESTINO –Recurse -Force

- Eliminar varias carpetas simultaneamente es decir borra toda la carpeta DESTINO1 Y DESTINO2 y todo lo que tenga

Remove-Item c:\DESTINO1, c:\DESTINO2 –Recurse -Force

- Mover una carpeta dentro de otra carpeta es decir la carpeta ORIGEN y todo lo que tenga se mueve así c:\DESTINO\ORIGEN

Move-Item -Path C:\ORIGEN -Destination C:\DESTINO

<h3>OPERADORES ARITMETICOS</h3>

<pre><code>
+ 		para la suma
- 		para la resta
* 		para la multiplicación
/ 		para la división
% 		para el módulo o resto de la división
** 		para la exponenciación
</pre></code>

<pre><code>
Clear-Host

$a = 5
$b = 2

$suma           = $a + $b
$resta          = $a - $b
$multiplicacion = $a * $b
$division       = $a / $b
$resto          = $a % $b

Write-Host "Suma           : ", $suma           #7
Write-Host "Resta          : ", $resta          #3
Write-Host "Multiplicacion : ", $multiplicacion #10
Write-Host "Division       : ", $division       #2,5
Write-Host "Resto          : ", $resto          #1

Pause
</pre></code>

<h3>OPERADORES DE COMPARACION</h3>

<pre><code>
-eq: 	igual que
-ne: 	distinto que
-gt: 	mayor que
-lt: 	menor que
-ge: 	mayor o igual que
-le: 	menor o igual que
</pre></code>

<h3>OPERADORES LOGICOS</h3>

<pre><code>
-not: 	negación lógica
-and: 	conjunción lógica (y lógico)
-or: 	disyunción lógica (o lógico)
-xor: 	disyunción exclusiva lógica (o exclusivo lógico)
</pre></code>

<h3>VALORES LOGICOS</h3>

<pre><code>
$true	Verdadero
$false  Falso

En general, los siguientes valores se consideran "falsos":

Representa la ausencia de un valor $null 
representa el valor falso $false
El número 0
La cadena vacía ""
El arreglo vacío @()
El hash table vacío @{}

if ("") {
    Write-Output "Este mensaje nunca se mostrará"
}

if (@()) {
    Write-Output "Este mensaje nunca se mostrará"
}

if (@{}) {
    Write-Output "Este mensaje nunca se mostrará"
}
</pre></code>

<h3>LIMPIAR PANTALLA</h3>

<pre><code>
Clear-Host
</pre></code>

<h3>PAUSE</h3>

<pre><code>
(1)  Esta forma si permite simular a la perfección como el pause de cmd

Write-Host "Presiona cualquier tecla para continuar..." -NoNewline
$null = $Host.UI.RawUI.ReadKey("NoEcho,IncludeKeyDown")

(2)  Esta forma de simular el pause no es completa ya que muestra los caracteres que se presiona.

Read-Host -Prompt "Presiona cualquier tecla para continuar..."
</pre></code>

<h3>INGRESAR DATOS POR CONSOLA</h3>

<pre><code>
(1)

$nombre = Read-Host "Ingresa tu nombre? "
Write-Host "Hola $nombre"

(2)

Write-Host "Ingresa tu nombre? " -NoNewline
$nombre = Read-Host
Write-Host "Hola $nombre"
</pre></code>

<h3>CONVERTIR TIPO CADENA A ENTERO - REAL - LOGICO</h3>

<pre><code>
# PROGRAMA

Clear-Host

$cadena = Read-Host "Ingrese una cadena? " 
$tipo = $cadena.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

$real_s = Read-Host "Ingrese un número real? " 
$real_d = [double]$real_s
$tipo = $real_d.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

$entero_s = Read-Host "Ingrese un número entero? " 
$entero_i = [int]$entero_s
$tipo = $entero_i.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

$logico_s = Read-Host "Ingrese un lógico (true, false)? " 
$logico_b = [boolean]$logico_s
$tipo = $logico_b.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

Pause

# SALIDA

Ingrese una cadena? : Walter
El tipo de la variable es: String
Ingrese un número real? : 1.72
El tipo de la variable es: Double
Ingrese un número entero? : 3
El tipo de la variable es: Int32
Ingrese un lógico (true, false)? : true
El tipo de la variable es: Boolean
Presione Entrar para continuar...:
</pre></code>

<h3>CONVERTIR TIPO ENTERO - REAL - LOGICO A CADENA</h3>

<pre><code>
# PROGRAMA

Clear-Host

$real_d = 1.72 
$real_s = [string]$real_d
$tipo = $real_s.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

$entero_i = 54 
$entero_s = [string]$entero_i
$tipo = $entero_s.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

$logico_b = $true
$logico_s = [string]$logico_b
$tipo = $logico_s.GetType().Name
Write-Host "El tipo de la variable es: $tipo"

Pause

# SALIDA

El tipo de la variable es: String
El tipo de la variable es: String
El tipo de la variable es: String
Presione Entrar para continuar...:
</pre></code>

<h3> ESTRUCTRUA SECUENCIAL</h3>

- ##### CALCULAR EL AREA DE UN RECTANGULO

<pre><code>
Clear-Host
Write-Host "CALCULAR EL AREA DE UN RECTANGULO"
Write-Host "---------------------------------"

$Longitud = Read-Host "Ingrese Longitud? " 
$Ancho    = Read-Host "Ingrese Ancho?    "

$Longitud = [double]::Parse($Longitud)
$Ancho = [double]::Parse($Ancho)

$Area = $Longitud * $Ancho

Write-Host "Longitud: ", $Longitud
Write-Host "Ancho   : ", $Ancho
Write-Host "Area    : ", $Area
Pause
</pre></code>

- ##### CALCULAR EL AREA DE UN TRIANGULO

<pre><code>
Clear-Host
Write-Host "CALCULAR EL AREA DE UN TRIANGULO"
Write-Host "--------------------------------"

$Base = Read-Host "Ingrese Base? " 
$Altura = Read-Host "Ingrese Altura?    "

$Base = [double]::Parse($Base)
$Altura = [double]::Parse($Altura)

$Area = ($Base * $Altura) / 2

Write-Host "Base   : ", $Base
Write-Host "Altura : ", $Altura
Write-Host "Area   : ", $Area
Pause
</pre></code>

- ##### CALCULAR LA MEDIA DE 4  NUMEROS

<pre><code>
Clear-Host

$numero1=Read-Host "Numero 1"
$numero2=Read-Host "Numero 2"
$numero3=Read-Host "Numero 3"
$numero4=Read-Host "Numero 4"

$numero1 = $numero1 -as [double];
$numero2 = $numero2 -as [double];
$numero3 = $numero3 -as [double];
$numero4 = $numero4 -as [double];

$media=($numero1+$numero2+$numero3+$numero4)/4

Write-Host "Media: $media"

Pause
</pre></code>

<pre><code>
Clear-Host

$numero1=2
$numero2=4
$numero3=6
$numero4=9

$media=($numero1+$numero2+$numero3+$numero4)/4
Write-Host "Media: $media"

Pause
</pre></code>

<h3>ESTRUCTURA CONDICIONAL BINARIO (IF...THEN...ELSE)</h3>

- ##### EVALUAR LA EDAD DE UNA PERSONA PARA SABER SI ES MAYOR O MENOR 

<pre><code>
Clear-Host

$edad = Read-Host "Ingrese su edad?"
$edad = [int]$edad
if($edad -gt 18) {
   Write-Host "Mayor de edad"
}else {
   Write-Host "Menor de edad"
}

Pause
</pre></code>

- ##### EVALUAR UN NUMERO EN EL SIGUIENTE INTERVALO [4,8] O [16,20] INCLUYE LOS EXTREMOS

<pre><code>
Clear-Host

$numero = Read-Host "Ingrese un número?"
$numero = [int]$numero
if(($numero -ge 4 -and $numero -le 8) -or ($numero -ge 16 -and $numero -le 20) ) {
   Write-Host "Si pertenece al intervalo"
}else {
   Write-Host "No pertenece al intervalo"
}

Pause
</pre></code>

- ##### EVALUAR UN NUMERO DEL 1...7 COMO DIA DE LA SEMANA. EL PROGRAMA INDICARA SI DICHO NÚMERO ES LUNES...DOMINGO, SI ES CUALQUIER OTRO NUMERO INDICARA NUMERO INCORRECTO.

<pre><code>
Clear-Host

$dia = Read-Host "Ingrese un día de la semana?"
$dia = [int]$dia
if($dia -eq 1) {
   Write-Host "Lunes"
}elseif($dia -eq 2) {
   Write-Host "Martes"
}elseif($dia -eq 3) {
   Write-Host "Miercoles"
}elseif($dia -eq 4) {
   Write-Host "Jueves"
}elseif($dia -eq 5) {
   Write-Host "Viernes"
}elseif($dia -eq 6) {
   Write-Host "Sabado"
}elseif($dia -eq 7) {
   Write-Host "Domingo"
}else {
   Write-Host "Número Incorrecto"
}

Pause
</pre></code>

<h3>ESTRUCTURA CONDICIONAL MULTIPLE (SWITCH...CASE)</h3>

- ##### EVALUAR UN NUMERO DEL 1...7 COMO DIA DE LA SEMANA. EL PROGRAMA INDICARA SI DICHO NÚMERO ES LUNES...DOMINGO, SI ES CUALQUIER OTRO NUMERO INDICARA NUMERO INCORRECTO.

<pre><code>
Clear-Host

$dia = Read-Host "Ingrese un día de la semana?"
$dia = [int]$dia
switch ($dia) {
    1 {
        Write-Output "Lunes"
    }
    2 {
        Write-Output "Martes"
    }
    3 {
        Write-Output "Miercoles"
    }
    4 {
        Write-Output "Jueves"
    }
    5 {
        Write-Output "Viernes"
    }
    6 {
        Write-Output "Sabado"
    }
    7 {
        Write-Output "Domingo"
    }
    default {
        Write-Output "Número Incorrecto"
    }
}

Pause

# El valor en $dia se ingreso como cadena y se convirtio a entero
</pre></code>

<pre><code>
Clear-Host

$dia = Read-Host "Ingrese un día de la semana?"
switch ($dia) {
    "1" {
        Write-Output "Lunes"
    }
    "2" {
        Write-Output "Martes"
    }
    "3" {
        Write-Output "Miercoles"
    }
    "4" {
        Write-Output "Jueves"
    }
    "5" {
        Write-Output "Viernes"
    }
    "6" {
        Write-Output "Sabado"
    }
    "7" {
        Write-Output "Domingo"
    }
    default {
        Write-Output "Número Incorrecto"
    }
}

Pause
</pre></code>

- ##### EVALUAR UNA CADENA DE LUNES...DOMINGO COMO DIA DE LA SEMANA. EL PROGRAMA INDICARA SI DICHA CADENA ES 1...7, SI ES CUALQUIER OTRA CADENA INDICARA NOMBRE INCORRECTO.

<pre><code>
Clear-Host

$dia = Read-Host "Ingrese un día de la semana con su nombre?"
switch ($dia) {
    "Lunes" {
        Write-Output "1"
    }
    "Martes" {
        Write-Output "2"
    }
    "Miercoles" {
        Write-Output "3"
    }
    "Jueves" {
        Write-Output "4"
    }
    "Viernes" {
        Write-Output "5"
    }
    "Sabado" {
        Write-Output "6"
    }
    "Domingo" {
        Write-Output "7"
    }
    default {
        Write-Output "Nombre Incorrecto"
    }
}

Pause
</pre></code>

<pre><code>
Clear-Host

$dia = Read-Host "Ingrese un día de la semana con su nombre?"
switch ($dia) {
    Lunes {
        Write-Output "1"
    }
    Martes {
        Write-Output "2"
    }
    Miercoles {
        Write-Output "3"
    }
    Jueves {
        Write-Output "4"
    }
    Viernes {
        Write-Output "5"
    }
    Sabado {
        Write-Output "6"
    }
    Domingo {
        Write-Output "7"
    }
    default {
        Write-Output "Nombre Incorrecto"
    }
}

Pause
</pre></code>

# El valor ingresado en $dia puede ser lunes, Lunes, LUnes es valido
</pre></code>

<h3>ESTRUCTURA BUCLE PARA (FOR)</h3>

- ##### GENERAR LA SERIE NATURAL 1 ... N

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
for ($i=1; $i -le $n; $i++) {
    Write-Host $i
}

Pause
</pre></code>

- ##### GENERAR LA SERIE NATURAL N ... 1

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
for ($i=$n; $i -ge 1; $i--) {
    Write-Host $i
}

Pause
</pre></code>

- ##### RECORRER UNA CADENA LETRA POR LETRA

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
for ($i=$n; $i -ge 1; $i--) {
    Write-Host $i
}

Pause
</pre></code>

- ##### RECORRER UNA CADENA LETRA POR LETRA

<pre><code>
Clear-Host

$cadena = Read-Host "Ingrese una cadena? "
$longitud = $cadena.Length
for($i=0; $i -lt $longitud; $i++) {
	$letra = $cadena[$i]
	Write-Host $letra
}	

Pause
</pre></code>

<h3>ESTRUCTURA BUCLE PARA CADA (FOREACH)</h3>

- ##### RECORRER UNA CADENA LETRA POR LETRA CON FOREACH

<pre><code>
Clear-Host

$cadena = Read-Host "Ingrese una cadena? "
foreach ($caracter in $cadena.ToCharArray()) {
    Write-Host $caracter
}

Pause
</pre></code>

- ##### RECORRER UN VECTOR NUMERO POR NUMERO CON FOREACH

<pre><code>
Clear-Host

$vector = 1.2, 3.4, 5.6, 7.8, 9.0
foreach ($numero in $vector) {
    Write-Host $numero
}

Pause
</pre></code>

<h3>ESTRUCTURA BUCLE MIENTRAS (WHILE)</h3>

- ##### GENERAR LA SERIE NATURAL 1 ... N

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = 1
while ($i -le $n) {
    Write-Host $i
    $i++
}

Pause
</pre></code>

- ##### GENERAR LA SERIE NATURAL N ... 1

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = $n
while ($i -ge 1) {
    Write-Host $i
    $i--
}

Pause
</pre></code>

<h3>ESTRUCTURA BUCLE HASTA (DO ... WHILE)</h3>

- ##### GENERAR LA SERIE NATURAL 1 ... N

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = 1
do {
    Write-Host $i
    $i++
} while ($i -le $n)

Pause
</pre></code>

- ##### GENERAR LA SERIE NATURAL N ... 1

<pre><code>
Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = $n
do {
    Write-Host $i
    $i--
} while ($i -ge 1)

Pause
</pre></code>

<h3>ARRAY UNIDIMENSIONAL (VECTOR)</h3>

- ##### DECLARAR UN VECTOR ESTATICO DE NUMEROS REALES Y LUEGO RECORRERLO PARA MOSTRARLO EN PANTALLA Y TAMBIEN MOSTRARLO IMPRIMIENDO EL VECTOR COMO UN TODO.

<pre><code>
Clear-Host

$vector = 1.2, 3.4, 5.6, 7.8, 9.0

for ($i=0; $i -lt $vector.Length; $i++) { # Recorrer el vector para imprimirlo uno por uno
    Write-Host "Elemento $i : $($vector[$i])"
}

Write-Host "El vector ingresado es: $($vector -join ', ')"  # Imprimir el vector como un todo

Pause
</pre></code>

- ##### DECLARAR UN VECTOR ESTATICO DE NUMEROS REALES Y LUEGO RECORRERLO PARA MOSTRARLO EN PANTALLA, Y TAMBIEN MOSTRARLO IMPRIMIENDO EL VECTOR COMO UN TODO.

<pre><code>
Clear-Host

$n = Read-Host "Ingrese el tamaño del vector? "  # Solicitar tamaño del vector al usuario
$vector = @() # Crear vector vacío

for ($i=0; $i -lt $n; $i++) {  # Solicitar al usuario que ingrese los números y agregarlos al vector
    $num = Read-Host "Ingrese un número? "
    $num = [float]$num # Convertir a número punto flotante
    $vector += $num
}

Write-Host "El vector ingresado es: $($vector -join ', ')"  # Imprimir el vector resultante

for ($i=0; $i -lt $vector.Length; $i++) {  # Recorrer el vector para mostrarlo uno por uno
    Write-Host "Elemento $i : $($vector[$i])"
}

Pause
</pre></code>

<h3>GESTIONAR ARCHIVOS CON FOR</h3>

- ##### LISTAR TODOS LOS NOMBRES DE LOS ARCHIVOS PRESENTES EN UN DIRECTORIO.

<pre><code>
Clear-Host

$archivos = Get-ChildItem "C:\Users\RYZEN\Documents" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
    Write-Host $archivos[$i].Name
}

Pause
</pre></code>

- ##### LISTAR TODOS LOS NOMBRES CON SU RUTA DE LOS ARCHIVOS PRESENTES EN UN DIRECTORIO. 

<pre><code>
Clear-Host

$archivos = Get-ChildItem "C:\Users\RYZEN\Documents" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
	 Write-Host $archivos[$i].FullName
}

Pause
</pre></code>

<pre><code>
Clear-Host

$archivos = Get-ChildItem "*.txt" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
	 Write-Host $archivos[$i].FullName
}

Pause
</pre></code>

- ##### COPIAR TODOS LOS ARCHIVOS DE UN DIRECTORIO A OTRO DIRECTORIO

<pre><code>
Clear-Host

$archivos = Get-ChildItem "C:\Users\RYZEN\Documents" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
	 Copy-Item $archivos[$i].FullName -Destination C:\AAAAAAA\
}

Pause
</pre></code>

<pre><code>
Clear-Host

$archivos = Get-ChildItem "C:\Users\RYZEN\Documents" -File

foreach ($archivo in $archivos) {
	 Copy-Item $archivo.FullName -Destination C:\AAAAAAA\
}

Pause
</pre></code>

<pre><code>
Clear-Host

$archivos = Get-ChildItem "*.ps1" -File

foreach ($archivo in $archivos) {
	 Copy-Item $archivo.FullName -Destination C:\AAAAAAA\
}

Pause
</pre></code>

- #####  RENOMBRAR TODOS LOS ARCHIVOS DE UN DIRECTORIO CON UN NOMBRE DE MANERA SECUENCIAL.

<pre><code>
Clear-Host

$archivos = Get-ChildItem "*.txt" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
    $nuevoNombre = "Apuntes" + $i + $archivos[$i].Extension
    Rename-Item $archivos[$i].FullName $nuevoNombre
}

Pause
</pre></code>


- ##### ELIMINAR TODOS LOS ARCHIVOS DE UN DIRECTORIO

<pre><code>
Clear-Host

$archivos = Get-ChildItem "*.txt" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
     Remove-Item $archivos[$i].FullName
}

Pause
</pre></code>

<h3>MENU</h3>

<pre><code>
Function buscar {
   Clear-Host
   Write-Host "BUSCAR"
   Write-Host "------"
   Pause
}

Function crear {
   Clear-Host
   Write-Host "CREAR"
   Write-Host "-----"
   Pause
}

Function eliminar {
   Clear-Host
   Write-Host "ELIMINAR"
   Write-Host "--------"
   Pause
}

Do {

    Clear-Host
    Write-Host "MENU"
    Write-Host
    Write-Host "1. Buscar"
    Write-Host "2. Crear"
    Write-Host "3. Eliminar"
    Write-Host "4. Salir"
    Write-Host

    $opcion = Read-Host "Seleccione opción "

    Switch($opcion){
       1 { buscar;break; }
       2 { crear;break; }
       3 { eliminar;break; }  
       4 { Clear-Host;Exit }  
    }

}While($true)
</pre></code>

<h3>TRY ... CATCH</h3>

<pre><code>
Clear-Host

$nums = Read-Host "Ingrese Numerador? "
$dens = Read-Host "Ingrese Denominador? "
try {
	  $numd = $nums -as [double];
      $dend = $dens -as [double];
	  $cocd = $numd / $dend
	  Write-Host "Cociente: ", $cocd
}catch {
	  Write-Host "Error: Entrada Incorrecta"
}

Pause
</pre></code>

<h3>FUNCIONES MATEMATICAS</h3>

<pre><code>
Clear-Host

Write-Host "RAIZ CUADRADA"
Write-Host "-------------"
$n = Read-Host "Ingrese un número "
$rc = [math]::Sqrt($n)
Write-Host "Raiz Cuadrada: $rc"

Write-Host "POTENCIA"
Write-Host "--------"
$b = Read-Host "Ingrese base "
$e = Read-Host "Ingrese exponente "
$po = [math]::Pow($b,$e)
Write-Host "Potencia: $po"

Pause
</pre></code>
 
<pre><code>
Clear-Host

Write-Host "AREA DE UN CIRCULO"
Write-Host "------------------"
$r = Read-Host "Ingrese Radio "
$a = [math]::pi  * [math]::Pow($r,2)
Write-Host "Area: $a"

Write-Host "PERIMETRO DE UN CIRCULO"
Write-Host "-----------------------"
$r = Read-Host "Ingrese Radio "
$p = 2 * [math]::pi  * $r
Write-Host "Perimetro: $p"

Pause
</pre></code>

<pre><code>
Clear-Host

Write-Host "CONSTANTES MATEMATICAS"
Write-Host "----------------------"
$pi = [math]::pi
$e  = [math]::e

Write-Host "PI: ", $pi
Write-Host "E : ", $e

Pause
</pre></code>
