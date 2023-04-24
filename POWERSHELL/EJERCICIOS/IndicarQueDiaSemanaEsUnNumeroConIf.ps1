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