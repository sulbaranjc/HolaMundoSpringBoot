# Hola Mundo con Spring Boot

## Descripción
Este es un proyecto básico de Spring Boot que sirve como introducción a la programación en Java con el framework Spring Boot. Implementa un servicio web REST con varias rutas que devuelven mensajes en formato HTML.

## Tecnologías Utilizadas
- **Java 21**
- **Spring Boot 3.4.2**
- **Maven**
- **IntelliJ IDEA (o cualquier IDE compatible con Spring Boot)**

## Instalación y Ejecución

### **1. Clonar el repositorio**
```sh
 git clone https://github.com/sulbaranjc/HolaMundoSpringBoot.git
 cd HolaMundoSpringBoot
```

### **2. Configurar el entorno**
Asegúrate de tener **Java 17** instalado. Puedes verificarlo con:
```sh
 java -version
```
Si no tienes Maven instalado, puedes usar el wrapper incluido:
```sh
 ./mvnw clean install   # En Linux/macOS
 mvnw.cmd clean install # En Windows
```

### **3. Ejecutar la aplicación**
```sh
 mvn spring-boot:run
```
O desde tu IDE, ejecuta `HolaMundoApplication.java`.

## Endpoints Disponibles
| Método | Ruta               | Descripción |
|--------|-------------------|-------------|
| GET    | `/app/ping`       | Devuelve "¡Pong!" |
| GET    | `/app/saludo1`    | Devuelve "¡Hola Mundo desde Spring Boot!" |
| GET    | `/app/saludo2`    | Devuelve "¡Hola Mundo Profesor desde Spring Boot!" |
| GET    | `/app/saludo?nombre=Juan` | Devuelve "¡Hola Juan desde Spring Boot!" |

## Ejemplo de Respuesta
### **Solicitud:**
```
GET http://localhost:8080/app/saludo?nombre=Carlos
```
### **Respuesta:**
```html
<h1 style="color:blue;">¡Hola Carlos desde Spring Boot!</h1>
```

## Recursos Adicionales
- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [Guía Oficial de Spring Boot](https://spring.io/guides/gs/spring-boot/)

## Autor
📌 **Profesor:** Juan Carlos Sulbarán González
📌 **Instituto:** ILERNA

¡Feliz codificación! 🚀

