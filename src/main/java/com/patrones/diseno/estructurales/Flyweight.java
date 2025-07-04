package com.patrones.diseno.estructurales;

import java.util.HashMap;
import java.util.Map;

/**
 * Patrón Flyweight
 *
 * Definición:
 * Usa el compartimiento para soportar grandes cantidades de objetos de forma eficiente.
 * Comparte objetos para reducir el consumo de memoria.
 *
 * Ejemplo de la vida cotidiana:
 * En un procesador de texto, cada letra "a" que ves en pantalla no es un objeto diferente,
 * sino que se reutiliza el mismo objeto para todas las "a".
 */

// Flyweight
interface Figura {
    void dibujar();
}

// Flyweight concreto
class CirculoFlyweight implements Figura {
    private String color;
    public CirculoFlyweight(String color) { this.color = color; }
    public void dibujar() { System.out.println("Círculo de color " + color); }
}

// Flyweight Factory
class FiguraFactory {
    private static final Map<String, Figura> circulos = new HashMap<>();
    public static Figura getCirculo(String color) {
        Figura circulo = circulos.get(color);
        if (circulo == null) {
            circulo = new CirculoFlyweight(color);
            circulos.put(color, circulo);
        }
        return circulo;
    }
}

// Patrón Flyweight
public class Flyweight {
    public static void main(String[] args) {
        Figura rojo1 = FiguraFactory.getCirculo("rojo");
        Figura rojo2 = FiguraFactory.getCirculo("rojo");
        rojo1.dibujar();
        rojo2.dibujar();
        System.out.println("¿Misma instancia? " + (rojo1 == rojo2));
    }
}
