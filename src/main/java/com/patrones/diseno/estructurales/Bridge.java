package com.patrones.diseno.estructurales;

/**
 * Patrón Bridge
 *
 * Definición:
 * Separa una abstracción de su implementación para que ambas puedan variar independientemente.
 *
 * Ejemplo de la vida cotidiana:
 * Un control remoto (abstracción) puede operar diferentes marcas de televisores (implementación).
 * El control remoto funciona igual, sin importar el televisor.
 */

// Implementador
interface Color {
    String aplicarColor();
}

// Implementador concreto
class Rojo implements Color {
    public String aplicarColor() {
        return "rojo";
    }
}

// Abstracción
abstract class Forma {
    protected Color color;
    public Forma(Color color) { this.color = color; }
    public abstract void dibujar();
}

// Abstracción refinada
class Circulo extends Forma {
    public Circulo(Color color) { super(color); }
    public void dibujar() {
        System.out.println("Dibujando círculo de color " + color.aplicarColor());
    }
}

// Patrón Bridge
public class Bridge {
    public static void main(String[] args) {
        Forma circulo = new Circulo(new Rojo());
        circulo.dibujar();
    }
}
