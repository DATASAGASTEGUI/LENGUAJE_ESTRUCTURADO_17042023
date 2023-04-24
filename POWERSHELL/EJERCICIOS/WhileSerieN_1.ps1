Clear-Host

$n = Read-Host "Ingrese n?"
$n = [int]$n
$i = $n
while ($i -ge 1) {
    Write-Host $i
    $i--
}

Pause