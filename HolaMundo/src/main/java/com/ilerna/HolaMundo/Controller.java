package com.ilerna.HolaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {
@GetMapping("/ping")
public String ping() {
    String mensajeHTML = "<h1 style=\"color:blue;\">¡Pong!</h1>";
    //System.out.println("¡Pong!");
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
    // Nuevo endpoint para recibir un nombre como parámetro
    @GetMapping("/saludo")
    public String saludo(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "<h1 style=\"color:blue;\">¡Hola " + nombre + " desde Spring Boot!</h1>";
    }
    // Nuevo endpoint para recibir dos valores numéricos y devolver la suma
    @GetMapping("/sumar")
    public String sumar(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        int suma = num1 + num2;
        return "<h1 style=\"color:green;\">La suma de " + num1 + " + " + num2 + " es: " + suma + "</h1>";
    }
}
