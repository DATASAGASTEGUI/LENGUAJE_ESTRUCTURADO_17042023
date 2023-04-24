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