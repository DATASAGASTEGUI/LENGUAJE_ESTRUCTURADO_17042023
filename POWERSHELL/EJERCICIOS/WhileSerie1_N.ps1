Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = 1
while ($i -le $n) {
    Write-Host $i
    $i++
}

Pause