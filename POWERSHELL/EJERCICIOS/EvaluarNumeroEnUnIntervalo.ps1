Clear-Host

$numero = Read-Host "Ingrese un número?"
$numero = [int]$numero
if(($numero -ge 4 -and $numero -le 8) -or ($numero -ge 16 -and $numero -le 20) ) {
   Write-Host "Si pertenece al intervalo"
}else {
   Write-Host "No pertenece al intervalo"
}

Pause