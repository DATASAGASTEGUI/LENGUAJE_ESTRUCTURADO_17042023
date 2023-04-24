Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = 1
do {
    Write-Host $i
    $i++
} while ($i -le $n)

Pause