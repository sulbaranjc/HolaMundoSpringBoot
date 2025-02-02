package com.ilerna.HolaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {
@GetMapping("/ping")
public String ping() {
    String mensajeHTML = "<h1 style=\"color:blue;\">¡Pong!</h1>";
    return mensajeHTML;
}
@GetMapping("/saludo1")
public String holaMundo() {
    String mensajeHTML = "<h1 style=\"color:blue;\">¡Hola Mundo desde Spring Boot!</h1>";
    return mensajeHTML;
}
    @GetMapping("/saludo2")
    public String holaMundoProfesor() {
        String mensajeHTML = "<h1 style=\"color:blue;\">¡Hola Mundo Profesor desde Spring Boot!</h1>";
        return mensajeHTML;
    }
}
