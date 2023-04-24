Clear-Host

$cadena = Read-Host "Ingrese una cadena? "
foreach ($caracter in $cadena.ToCharArray()) {
    Write-Host $caracter
}

Pause
