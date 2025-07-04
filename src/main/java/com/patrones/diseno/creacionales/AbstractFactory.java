package com.patrones.diseno.creacionales;

/**
 * Patrón Abstract Factory
 *
 * Definición:
 * Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas.
 *
 * Ejemplo de la vida cotidiana:
 * Una fábrica de muebles puede crear sillas y mesas de estilo moderno o clásico.
 * El cliente elige el estilo y la fábrica produce todos los muebles de ese estilo.
 */

// Abstract Factory
interface Boton {
    void dibujar();
}

class BotonWindows implements Boton {
    public void dibujar() {
        System.out.println("Dibujar botón Windows");
    }
}

class BotonMac implements Boton {
    public void dibujar() {
        System.out.println("Dibujar botón Mac");
    }
}

interface GUIFactory {
    Boton crearBoton();
}

class WindowsFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonWindows();
    }
}

class MacFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonMac();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Boton boton = factory.crearBoton();
        boton.dibujar();

        factory = new MacFactory();
        boton = factory.crearBoton();
        boton.dibujar();
    }
}
