# EJEMPLOS SCRIPT LINUX

- Determinar si 2 es mayor que 1.  Usar corchete simple

<pre><code>
#!/bin/bash
if [ 2 -gt 1 ]
then
   echo "2 es mayor que 1"
else
   echo "2 no es mayor que 1"
fi;

RESULTADO

2 es mayor que 1
</code></pre>

<pre><code>
#!/bin/bash
# MEJORADO
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

RESULTADO

Ingrese número 1? 4
Ingrese número 2? 5
4 no es mayor que 5

Press enter to continue...
</pre></code>