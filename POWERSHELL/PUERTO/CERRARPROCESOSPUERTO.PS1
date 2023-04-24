Clear-Host
$port = Read-Host "Ingresa número puerto? "
$vector_idprocesos = Get-NetTCPConnection -LocalPort $port | Select-Object -ExpandProperty OwningProcess
foreach($id in $vector_idprocesos) {
	 Write-Host $id
	 Stop-Process -Id $id -Force
}
Pause