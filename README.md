# cvds-lab5
# Integrantes
* Manuel Suarez
* Yeltzyn Sierra
# Respuestas
## PARTE I. - JUGANDO A SER UN CLIENTE HTTP
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
