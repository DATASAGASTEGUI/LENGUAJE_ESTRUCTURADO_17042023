<h1>EXPRESIONES REGULARES</h1>

<p>
Una expresión regular, también conocida como regex o regexp, es una secuencia de caracteres que define un patrón de búsqueda. Se utiliza para buscar, reemplazar o manipular texto en cadenas de caracteres.
</p>

<p>
Las expresiones regulares están formadas por una combinación de caracteres literales y caracteres especiales que tienen un significado especial. Por ejemplo, el carácter . se utiliza en una expresión regular para representar cualquier carácter, mientras que el carácter * se utiliza para representar cero o más ocurrencias del carácter anterior.
<p>

<p>
Las expresiones regulares se utilizan en muchos lenguajes de programación, herramientas de línea de comandos y aplicaciones para buscar patrones de texto. También se utilizan en editores de texto avanzados para buscar y reemplazar texto de manera más eficiente y precisa.
</p>

<p>
Aunque la sintaxis y los caracteres especiales pueden variar ligeramente según la implementación de expresiones regulares que se esté utilizando, la mayoría de los patrones básicos son comunes a través de las implementaciones. Con un poco de práctica, las expresiones regulares pueden resultar muy útiles para tareas de manipulación de texto y búsqueda de patrones complejos.
</p>

<h1>EJEMPLOS</h1>

- ER REGULAR QUE RECONOZCA LAS CADENAS QUE SEAN NUMERO ENTEROS DE UN SOLO DIGITO CON SIGNO: +9, -9, -1, +1

<pre>
<code>  
[-+][0-9]
</code>
</pre>

- ER REGULAR QUE RECONOZCA LAS CADENAS QUE SEAN NUMERO ENTEROS DE UN SOLO DIGITO CON O SIN SIGNO: +9, -9, 9, 1 

<pre>
<code>
[-+]?[0-9]
</code>
</pre>                

- ER QUE RECONOCE SOLO LAS CADENAS: LUIS,CARLOS, CARMEN Y MIGUEL

<pre>
<code>
(LUIS|CARLOS|CARMEN|MIGUEL)
</code>
</pre>

- ER QUE RECONOZCA SOLO NUMEROS REALES CON O SIN SIGNOS: .5, 0.5, 1.7, 2.8, 1, -0, -1.5, +2.5, 2.5, -.5

<pre>
<code>
[-+]?[0-9]*\\.?[0-9]+  

([-+]?[0-9]*\\.[0-9]+)|([-+]?[0-9]+) 
</code>
</pre> 

- ER QUE RECONOZCA SOLO VOCALES

<pre>
<code>
[AEIOU]
</code>
</pre>

- ER QUE RECONOZCA SOLO CONSONANTES

<pre>
<code>
[BCDFGHJKLMNÑPQRSTVWXYZ]
</code>
</pre>

- ER QUE RECONOZCA CADENAS DONDE PUEDE ESTAR PRESENTE CUALQUIER CARACTER MENOS A,B,C

<pre>
<code>  
[^ABC]
</code>
</pre>

- ER QUE RECONOZCA UNA PALABRA EN ESPAÑOL

<pre>
<code>
[A-Za-záéíóúüÁÉÍÓÚÜñÑ]
</code>
</pre>

- ER QUE RECONOCE SOLO LAS CADENAS: true y false

<pre>
<code>
(true|false)
</code>
</pre>

- ER QUE RECONOZCA UNA ORACION SOLO FORMADO POR LETRAS DEL ALFABETO ESPAÑOL

<pre>
<code>
[A-Za-záéíóúüÁÉÍÓÚÜñÑ\\s]
</code>
</pre>

- ER QUE RECONOZCA TODAS LAS CADENAS QUE INICEN CON LA SECUENCIA "ABC" Y CONTINUE CON CUALQUIER COSA.

<pre>
<code>
ABC.*
</code>
</pre>

- ER QUE RECONOZCA TODAS LAS CADENAS FORMADAS POR UNO O DOS DIGITOS

<pre>
<code>
[0-9]{1,2}
</code>
</pre>

- ER QUE RECONOZCA TODAS LAS CADENAS FORMADAS POR NUMEROS CON UNO O DOS 
  DECIMALES

<pre>
<code>
\d+\\.\d{1,2}
[0-9]+\\.[0-9]{1,2}
</code>
</pre>

- ER QUE QUE RECONOZCA TODAS LAS CADENAS QUE INICIAN CON LA LETRA E Y CONTINUA CON NADA O UNA LETRA S

<pre>
<code>  
ES?   --->   E, ES
</code>
</pre>

- ER QUE QUE RECONOZCA TODAS LAS CADENAS QUE INICIAN CON LA LETRA E Y CONTINUA CON UNA O MAS LETRA S

<pre>
<code>  
ES+   --->   ES, ESS, ESSSSSSSSSSS
</code>
</pre>

- ER QUE RECONOZCA TODAS LAS CADENAS QUE CONTENGAN LA SECUENCIA ABC

<pre>
<code>
.*ABC.*   --->   ABC, ????ABCHOLA
</code>
</pre>

- ER QUE RECONOZCA TODAS LAS CADENAS QUE INICIEN CON UNA LETRA DISTINTA DE "E" O "I" Y TERMINA CON LA LETRA "S"

<pre>
<code>  
[^EI].*S
</code>
</pre>
	
- ER QUE RECONOZCA TODAS LAS CADENAS QUE INICIAN CON "S" Y TERMINAN CON "S" Y ENTRE AMBAS UN SOLO CARACTER CUAQLUIERA

<pre>
<code>  
S.S
</code>
</pre> 

<h1>BIBLIOGRAFIA</div>

https://jarroba.com/busqueda-de-patrones-expresiones-regulares/

<h1>ANEXO 1: VIDEO YOUTUBE</h1>

<p align="center">
  <a href="https://www.youtube.com/watch?v=wfogZfIS03U"_blank">
     <img src="https://i.ytimg.com/vi/wfogZfIS03U/hq720.jpg" alt="Expresiones Regulares" width="400" height="300" border="10" /></a>
  <a href="https://www.youtube.com/watch?v=wfogZfIS03U"></a>
</p>

<h1>ANEXO 2: VALIDAR EXPRESION REGULAR CON JAVA</h1>

<pre>
<code>
import java.util.Scanner;

public class ValidarExpresionRegular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String er = "[^EI].*S";
        boolean correcto;
        String cadena = "";
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.nextLine();
            correcto = cadena.matches(er);
            if (!correcto) {
                System.out.println("ERROR");
            }
        } while (!correcto);
        System.out.println("OK");
    }
}
</code>
</pre>

