package com.patrones.diseno.creacionales;

/**
 * Patrón Prototype
 *
 * Definición:
 * Permite copiar objetos existentes sin depender de sus clases concretas.
 *
 * Ejemplo de la vida cotidiana:
 * Hacer fotocopias de un documento: puedes crear muchas copias idénticas del original.
 */

interface Prototipo extends Cloneable {
    Prototipo clonar();
}

class PrototipoConcreto implements Prototipo {
    private String dato;

    public PrototipoConcreto(String dato) {
        this.dato = dato;
    }

    public Prototipo clonar() {
        return new PrototipoConcreto(this.dato);
    }

    public String toString() {
        return "Prototipo: " + dato;
    }
}

public class Prototype {
    public static void main(String[] args) {
        Prototipo original = new PrototipoConcreto("Ejemplo");
        Prototipo copia = original.clonar();
        System.out.println(original);
        System.out.println(copia);
    }
}
