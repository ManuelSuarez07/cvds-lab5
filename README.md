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



## Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?
## ¿Cuáles son las diferencias con los diferentes parámetros?
