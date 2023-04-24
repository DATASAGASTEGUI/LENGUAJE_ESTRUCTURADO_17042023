Clear-Host

$n = Read-Host "Ingrese n?"

for ($i=1; $i -le $n; $i++) {
    Write-Host $i
}

Pause