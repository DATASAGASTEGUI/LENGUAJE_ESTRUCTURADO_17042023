#!/bin/bash
clear
echo -n "Ingrese número 1? "
read n1
echo -n "Ingrese número 2? "
read n2
if [ $n1 -gt $n2 ]
then
   echo "$n1 es mayor que $n2"
else
   echo "$n1 no es mayor que $n2"
fi;
read -rsp $'\nPress enter to continue...'