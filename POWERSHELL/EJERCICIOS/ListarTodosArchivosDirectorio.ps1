Clear-Host

$archivos = Get-ChildItem "C:\Users\RYZEN\Documents" -File

for ($i=0; $i -lt $archivos.Count; $i++) {
    Write-Host $archivos[$i].Name
}

Pause
