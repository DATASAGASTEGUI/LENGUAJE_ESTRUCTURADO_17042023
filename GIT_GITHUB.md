<h1>GIT</h1>

- Git es un sistema de control de versiones distribuido, utilizado para gestionar y controlar el desarrollo de software. Fue creado por Linus Torvalds en 2005 para gestionar el desarrollo del kernel de Linux, y desde entonces ha sido ampliamente adoptado en la industria del software para el control de versiones y el desarrollo colaborativo.

- Con Git, los desarrolladores pueden crear una "copia de trabajo" de un proyecto de software y realizar cambios en ella. Estos cambios se pueden guardar y rastrear a través de "confirmaciones" (commits), lo que permite a los desarrolladores volver a versiones anteriores del proyecto y colaborar en el desarrollo del software en equipo.

- Una de las principales ventajas de Git es que es un sistema de control de versiones distribuido, lo que significa que no hay un repositorio central único que se utilice para almacenar el código fuente. En su lugar, cada desarrollador tiene una copia completa del repositorio en su propio sistema local, lo que permite una mayor flexibilidad en la forma en que se gestionan los cambios y se colabora en el desarrollo del software.

- Git también cuenta con una amplia gama de herramientas y características para la gestión del código fuente, como la creación de ramas (branches) y etiquetas (tags), la fusión de cambios entre ramas y la integración con herramientas de automatización de compilación y pruebas.

- En resumen, Git es una herramienta de control de versiones esencial para el desarrollo de software colaborativo, que permite a los desarrolladores trabajar juntos de manera más eficiente y controlar de forma efectiva el historial de cambios y el desarrollo de un proyecto de software.

<h1>GITHUB</h1>

- GitHub es una plataforma de alojamiento de repositorios de código fuente que utiliza el sistema de control de versiones Git. Es una plataforma en línea que permite a los desarrolladores y equipos de desarrollo alojar, gestionar y compartir código fuente y proyectos de software.

- En GitHub, los usuarios pueden crear repositorios públicos o privados para alojar su código fuente. Los repositorios son accesibles a través de una interfaz web, que proporciona herramientas para la gestión del código fuente, incluyendo la creación y gestión de ramas (branches), la revisión de cambios, la integración de código y la creación de versiones.

- Además de la gestión de repositorios de código fuente, GitHub también proporciona herramientas de colaboración, como la creación de "pull requests" para que los usuarios soliciten cambios en el código fuente, la gestión de problemas y la realización de comentarios y revisiones de código.

- GitHub también es conocido por su amplia comunidad de usuarios, lo que permite a los desarrolladores de todo el mundo contribuir a proyectos de software y colaborar en su desarrollo. Además, la plataforma es utilizada por muchas empresas y organizaciones para alojar y gestionar sus proyectos de software, lo que la convierte en una herramienta esencial para el desarrollo de software moderno y colaborativo.

- En resumen, GitHub es una plataforma de alojamiento de repositorios de código fuente y una herramienta de colaboración esencial para el desarrollo de software moderno, que permite a los desarrolladores alojar, gestionar y compartir su código fuente y colaborar en su desarrollo con otros usuarios.

<h1>EJEMPLOS</h1>

- SUPONIENDO QUE LOS IDENTIFICADORES DE LOS COMITS SON LOS SIGUIENTES:  IC1, IC2, IC3, IC4, IC5, IC6  CUAL SERIA EL COMANDO PARA ELIMINAR LOS COMITS 2,3,4,5,6 SIN MODIFICAR EL AREA DE TRABAJO

<pre>
<code>
git reset IC1
</code>
</pre>

- SUPONIENDO QUE LOS IDENTIFICADORES DE LOS COMITS SON LOS SIGUIENTES: IC1, IC2, IC3, IC4, IC5, IC6 CUAL SERIA EL COMANDO PARA ELIMINAR LOS COMITS 5,6 MODIFICANDO EL AREA DE TRABAJO, INDICANDO CUAL ES EL COMMIT QUE CORRESPONDERÍA CON EL AREA DE TRABAJO

<pre>
<code>
git reset --hard IC4
</pre>
</code>

- CUAL ES EL COMANDO QUE ME PERMITE HACER COMMIT SIEMPRE EN EL ULTIMO REALIZADO

<pre>
<code>
git commit --amend -m "foto1"
</code>
</pre>

- CUAL ES EL COMANDO QUE ME PERMITE OBTENER INFORMACION SOBRE EL HISTORIAL DE COMMITS DE MANERA LARGA

<pre>
<code>
git log
</code>
</pre>

- CUAL ES EL COMANDO QUE ME PERMITE SACAR UN ARCHIVO DEL AREA DE PREPARACION AL AREA DE TRABAJO

<pre>
<code>
git rm --cached archivo.txt
</code>
</pre>

- CUAL ES EL COMANDO QUE ME PERMITE RECUPERAR TODOS LOS ARCHIVOS DEL ULTIMO COMMIT

<pre>
<code>
git checkout .
</code>
</pre>

- SUPONIENDO QUE TENGO UNA RAMA LLAMADA VERSION1 CUAL ES EL COMANDO QUE ME PERMITE CAMBIAR A DICHA RAMA

<pre>
<code>
git checkout VERSION1
</code>
</pre>

- SUPONIENDO QUE LOS IDENTIFICADORES DE LOS COMITS SON LOS SIGUIENTES: IC1, IC2, IC3, IC4, IC5, IC6 CUAL ES EL COMANDO QUE ME PERMITE TRAER AL AREA DE TRABAJO LO QUE TENGO FOTOGRAFIADO EN EL COMMIT IC3

<pre>
<code>
git checkout IC3
</code>
</pre>

- CUAL ES EL COMANDO EN GIT QUE ME PERMITE ELIMINAR UNA RAMA EXISTENTE LLAMADA VERSION1

<pre>
<code>
git branch -D VERSION1
</code>
</pre>

- CUAL ES EL COMANDO EN GIT AÑADIR SOLAMENTE EL ARCHIVO.TXT AL AREA DE PREPARACION

<pre>
<code>
git add ARCHIVO.TXT
</code>
</pre>

- CREAR UNA RAMA LLAMADA VERSION1

<pre>
<code>
git branch VERSION1
</code>
</pre>

- MOSTRAR EL CONTENIDO DE UN COMMIT

<pre>
<code>
git show IC1
</code>
</pre>

- MOSTRAR TODAS LAS RAMAS

<pre>
<code>
git branch
</code>
</pre>