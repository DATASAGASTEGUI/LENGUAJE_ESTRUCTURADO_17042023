Clear-Host

$vector = 1.2, 3.4, 5.6, 7.8, 9.0

for ($i=0; $i -lt $vector.Length; $i++) { # Recorrer el vector para imprimirlo uno por uno
    Write-Host "Elemento $i : $($vector[$i])"
}

Write-Host "El vector ingresado es: $($vector -join ', ')"  # Imprimir el vector como un todo

Pause
