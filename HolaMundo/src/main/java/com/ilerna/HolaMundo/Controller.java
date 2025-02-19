package com.ilerna.HolaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Controller {

    @GetMapping("/ping")
    //localhost:8080/api/ping
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
    // localhost:8080/api/sumar?num1=5&num2=7
    @GetMapping("/sumar")
    public String sumar(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        int suma = num1 + num2;
        return "<h1 style=\"color:green;\">La suma de " + num1 + " + " + num2 + " es: " + suma + "</h1>";
    }
    // Nuevo endpoint para determinar si una palabra es palíndroma
// localhost:8080/api/palindromo?palabra=oso
    @GetMapping("/palindromo")
    public String palindromo(@RequestParam(name = "palabra") String palabra) {
        boolean esPalindromo = Dependencias.LibreraStr.esPalindromo(palabra);
        String color = esPalindromo ? "blue" : "red";
        return String.format("<h1 style=\"color:%s;\">La palabra ( %s ) %s palíndroma</h1>",
                color,
                palabra,
                esPalindromo ? "es" : "no es");
    }
    // Nuevo endpoint para determinar si un número es par
    // localhost:8080/api/par?num=5
    @GetMapping("/par")
    public String par(@RequestParam(name = "num") int num) {
        boolean esPar = Dependencias.LibNum.esPar(num);
        String color = esPar ? "blue" : "red";
        return String.format("<h1 style=\"color:%s;\">El número %d %spar</h1>",
                color,
                num,
                esPar ? "es " : "es im");
    }
    // Nuevo endpoint para determinar si un número es primo
    // localhost:8080/api/primo?num=5
    @GetMapping("/primo")
    public String primo(@RequestParam(name = "num") int num) {
        boolean esPrimo = Dependencias.LibNum.esPrimo(num);
        String color = esPrimo ? "blue" : "red";
        return String.format("<h1 style=\"color:%s;\">El número %d %s primo</h1>",
                color,
                num,
                esPrimo ? "es " : "no es");
    }

}
