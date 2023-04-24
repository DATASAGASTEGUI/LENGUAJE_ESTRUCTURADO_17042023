Clear-Host

$cadena = Read-Host "Ingrese una cadena? "
$longitud = $cadena.Length
for($i=0; $i -lt $longitud; $i++) {
	$letra = $cadena[$i]
	Write-Host $letra
}	

Pause
