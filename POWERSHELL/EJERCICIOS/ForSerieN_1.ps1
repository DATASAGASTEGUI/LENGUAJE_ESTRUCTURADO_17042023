Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
for ($i=$n; $i -ge 1; $i--) {
    Write-Host $i
}

Pause