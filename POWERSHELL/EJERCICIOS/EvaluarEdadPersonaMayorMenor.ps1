Clear-Host

$edad = Read-Host "Ingrese su edad?"
$edad = [int]$edad
if($edad -gt 18) {
   Write-Host "Mayor de edad"
}else {
   Write-Host "Menor de edad"
}

Pause