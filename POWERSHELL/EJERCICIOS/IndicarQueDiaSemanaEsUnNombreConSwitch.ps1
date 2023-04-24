Clear-Host

$dia = Read-Host "Ingrese un día de la semana con su nombre?"
switch ($dia) {
    "Lunes" {
        Write-Output "1"
    }
    "Martes" {
        Write-Output "2"
    }
    "Miercoles" {
        Write-Output "3"
    }
    "Jueves" {
        Write-Output "4"
    }
    "Viernes" {
        Write-Output "5"
    }
    "Sabado" {
        Write-Output "6"
    }
    "Domingo" {
        Write-Output "7"
    }
    default {
        Write-Output "Nombre Incorrecto"
    }
}

Pause