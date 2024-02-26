# cvds-lab5
# Integrantes
* Manuel Suarez
* Yeltzyn Sierra
# Respuestas
# PARTE I. - JUGANDO A SER UN CLIENTE HTTP
### Abra una terminal Linux o consola de comandos Windows.
### Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
### Host: www.escuelaing.edu.co
### Puerto: 80 Teniendo en cuenta los parámetros del comando telnet:
## Solicitando el recurso html :
## Ejecutar el comandotelnet HOST PORT :  $ telnet www.escuelaing.edu.co 80
### Antes de que el servidor cierre la conexión por falta de comunicación:
### Revise el RFC del protocolo HTTP, sobre cómo realizar una petición GET. Debe lucir más o menos de esta forma:

### GET /with-a-resource.html HTTP/1.0
### Host: www.escuelaing.edu.co
### Con esto, solicite al servidor el recurso sssss/abc.html, usando la versión 1.0 de HTTP. Copie las dos lineas de codigo con el recurso agregado y peguelas en la consola del servidor ya abierta. Asegúrese de presionar ENTER dos veces después de ingresar el comando.

## Se deberá realizar la solicitud GET, introduciendo el comando:
## $ GET /sssss/abc.html HTTP/1.0

## ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
#### Cuando realizamos  esta solicitud salen los errores
* Error 400: Solicitud incorrecta :Lo cual nos Indica que el sitio web o Host, no reconoce el comando o la solicitud del cliente porque no se esta respetando el protocolo HTTP, debido a esto, no se puede procesar.
* Error 301: Movido permanentemente : Este error Indica que el host ha sido capaz de comunicarse con el servidor pero que el recurso solicitado ha sido movido a otra dirección permanentemente.
  
## ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
* 100-199: Información
* 200-299: Éxito
* 300-399: Redirecciones
* 400-499: Errores del cliente
* 500-599: Errores del servidor

### Solicitando el recurso html:
### Ahora, solicita el recurso /html. (GET), Ejecutar el comandotelnet HOST PORT

## $ telnet www.httpbin.org 80

### Se deberá realizar la solicitud GET, introduciendo el comando:

## $ GET /html HTTP/1.1
## Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?
![Texto alternativo](https://github.com/ManuelSuarez07/cvds-lab5/blob/main/imagen_2024-02-25_135738115.png)

### Seleccione el contenido HTMLde la respuesta y copielo al cortapapeles CTRL-SHIFT-C. 
### Ejecute el comando wc(recuento de palabras) para contar palabras con la opción -c para contar el número de caracteres:
## $ wc -c 
![Texto alternativo](https://github.com/ManuelSuarez07/cvds-lab5/blob/main/Part%20I/total%20palabras.png)
## ¿Cuál esla diferencia entre los verbos GET y POST?
* GET: El método GET lleva una representación de un recurso específico que se encuentran almacenados en un servidor al usuario. Las peticiones que usan el método GET sólo deben recuperar datos.
* POST: El método POST se utiliza para enviar una entidad a un recurso en específico, provocando a menudo un cambio en el estado o efectos secundarios en el servidor.
* Diferencias: El método GET lleva los datos usando la URL de forma visible, el método POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario)

## ¿Qué otros tipos de peticiones existen?
* PUT: Envía datos al servidor para ser almacenados en un recurso específico. Se utiliza para actualizar o crear un recurso en el servidor.
* DELETE: Solicita eliminar un recurso específico en el servidor.
* PATCH: Se utiliza para aplicar modificaciones parciales a un recurso.
* HEAD: Similar a GET, pero solicita solo los encabezados de respuesta, sin el cuerpo de la respuesta.
* OPTIONS: Solicita información sobre las opciones de comunicación disponibles para el recurso objetivo, como los métodos HTTP admitidos por el servidor.
* TRACE: Utilizado principalmente para la depuración, solicita al servidor que devuelva un mensaje de respuesta que incluya los encabezados de solicitud recibidos.

### En la práctica no se utiliza telnetpara hacer peticiones a sitios web sino el comando curlcon ayuda de la línea de comandos:
## curl www.httpbin.org
### El objetivo de curl es transferir datos, sin interacción del usuario, hacia o desde un servidor.
### Utilice ahora el parámetro -v:
## curl www.httpbin.org -v
![Texto alternativo](https://github.com/ManuelSuarez07/cvds-lab5/blob/main/Part%20I/curl.png)
### Utilice ahora el parámetro -i:
## curl www.httpbin.org -i
![Texto alternativo](https://github.com/ManuelSuarez07/cvds-lab5/blob/main/Part%20I/curl%20-i.png)
## ¿Cuáles son las diferencias con los diferentes parámetros?
* -v suele activar el modo "verboso" o detallado, proporcionando una salida más informativa en general.
* -i se usa para incluir ciertos elementos específicos (como encabezados de respuesta HTTP) en la salida.

# Part II
## ¿Por qué MVC obtiene ese nombre?
* Este nombre se debe a que sigue una especie de estructura llamada Modelo-Vista-Controlador (MVC), que es como el esqueleto de cómo se organiza la aplicación.
* El "Modelo" es como el depósito donde guardamos todos los datos importantes que la aplicación necesita. Puede ser uno o muchos datos diferentes.
* El "Controlador" es como el cerebro de la operación. Contiene todas las instrucciones y decisiones sobre cómo la aplicación debe funcionar. Es como el director de orquesta. Y la "Vista" es lo que tus ojos ven en la pantalla. Es como el diseño o el aspecto visual de la aplicación. Utilizamos diferentes herramientas para crearlo, pero básicamente es cómo se muestra la información al usuario. 

## ¿Cuáles son las ventajas de usar MVC?
### Ventajas del Marco Spring MVC
#### El Marco Spring MVC ofrece una serie de beneficios que lo convierten en una opción popular para el desarrollo de aplicaciones web. Algunas de sus ventajas más destacadas:
1) Roles bien definidos: Spring MVC organiza claramente cada componente de una aplicación web, asignándole funciones específicas. Esto facilita la comprensión de la estructura y el flujo de la aplicación.
2) Ligero: Utiliza un enfoque de contenedor de servlets liviano, lo que significa que no sobrecarga la aplicación con recursos innecesarios. Esto contribuye a un rendimiento eficiente y a una implementación más rápida de la aplicación.
3) Configuración robusta: Proporciona una configuración sólida y flexible para el desarrollo de aplicaciones. Esta configuración incluye referencias simples entre diferentes componentes, lo que simplifica el proceso de desarrollo y mantenimiento.
4) Desarrollo ágil: Spring MVC facilita un proceso de desarrollo ágil y paralelo. Los desarrolladores pueden trabajar en diferentes partes de la aplicación simultáneamente, lo que acelera el tiempo de desarrollo y permite una respuesta más rápida a los cambios.
5) Reutilización de código empresarial: Permite la reutilización de componentes y lógica de negocio existentes en lugar de crearlos desde cero. Esto reduce la duplicación de código y promueve las mejores prácticas de desarrollo.
6) Facilidad de pruebas: Spring MVC fomenta la creación de clases JavaBeans que son fáciles de probar. Esto permite a los desarrolladores realizar pruebas unitarias y de integración de manera eficiente para garantizar el correcto funcionamiento de la aplicación.
7) Flexibilidad en el mapeo: Proporciona anotaciones específicas que simplifican el mapeo de las solicitudes a los controladores correspondientes. Esto ofrece flexibilidad en el diseño de la aplicación y facilita la gestión de rutas y redirecciones. 

## ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
### Spring MVC:
* src/main/java: Almacena los archivos fuente de Java específicos de Spring MVC, como controladores y servicios.
* src/main/resources: Utilizado para recursos no Java relacionados con Spring MVC, como archivos de configuración y propiedades específicas de Spring.
* src/main/webapp: Contiene los archivos web estáticos y los recursos web específicos de la capa de presentación de Spring MVC, como HTML, JSP, CSS y JavaScript.
* src/test: Directorio destinado para las pruebas unitarias y de integración específicas de Spring MVC.
### Maven:
* src/main/java: Similar a Spring MVC, almacena los archivos fuente de Java, pero sin ninguna especificidad de un framework en particular.
* src/main/resources: Se utiliza para recursos no Java, como archivos de configuración y propiedades, sin estar vinculado directamente a Spring MVC o cualquier otro framework.
* src/main/webapp: Contiene archivos web estáticos y recursos web, pero sin la especificidad de un framework en particular.
* src/test: Directorio para almacenar archivos de prueba, independiente de cualquier framework específico.
### Java EE (Enterprise Edition):
* src/main/java: Similar a Spring MVC y Maven, almacena los archivos fuente de Java sin ninguna especificidad de un framework.
* src/main/resources: Utilizado para recursos no Java, como archivos de configuración y propiedades, sin estar vinculado a un framework específico.
* WebContent (o src/main/webapp): Contiene archivos web estáticos y recursos web, similar a Spring MVC y Maven, pero sin la vinculación directa a un framework específico.
* src/test: Directorio para almacenar archivos de prueba, independiente de cualquier framework específico.
## ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
* En este caso utilizamos @Controller la cual es una anotación que se utiliza para marcar una clase como controlador de Spring MVC. Indica que la clase define métodos de controlador que manejan las solicitudes HTTP.
* También utilizamos @ModelAttribute: que en este caso lo utilizamos para vincular un atributo de modelo con un método de controlador, lo que permite compartir datos entre la vista y el controlador.

# Part III
## El trabajo realizado de la parte 3 se encuentra en la rama con el nombre "PartIII"
