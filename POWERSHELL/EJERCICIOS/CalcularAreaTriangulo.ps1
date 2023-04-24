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
