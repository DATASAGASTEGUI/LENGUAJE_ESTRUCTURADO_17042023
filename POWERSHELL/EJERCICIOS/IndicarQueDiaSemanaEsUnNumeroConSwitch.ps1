Clear-Host

$dia = Read-Host "Ingrese un día de la semana?"
$dia = [int]$dia
switch ($dia) {
    1 {
        Write-Output "Lunes"
    }
    2 {
        Write-Output "Martes"
    }
    3 {
        Write-Output "Miercoles"
    }
    4 {
        Write-Output "Jueves"
    }
    5 {
        Write-Output "Viernes"
    }
    6 {
        Write-Output "Sabado"
    }
    7 {
        Write-Output "Domingo"
    }
    default {
        Write-Output "Número Incorrecto"
    }
}

Pause