Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = $n
do {
    Write-Host $i
    $i--
} while ($i -ge 1)

Pause