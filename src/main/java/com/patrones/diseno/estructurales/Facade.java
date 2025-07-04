package com.patrones.diseno.estructurales;

/**
 * Patrón Facade
 *
 * Definición:
 * Proporciona una interfaz unificada para un conjunto de interfaces en un subsistema.
 * Facade define una interfaz de alto nivel que hace el subsistema más fácil de usar.
 *
 * Ejemplo de la vida cotidiana:
 * Un control remoto simplifica el uso de un televisor, ocultando la complejidad de los circuitos internos.
 */

// Subsistemas
class Motor {
    void encender() { System.out.println("Motor encendido"); }
}
class Luces {
    void encender() { System.out.println("Luces encendidas"); }
}

// Fachada
public class Facade {
    private Motor motor = new Motor();
    private Luces luces = new Luces();

    public void arrancarCoche() {
        motor.encender();
        luces.encender();
        System.out.println("Coche listo para conducir");
    }

    public static void main(String[] args) {
        Facade coche = new Facade();
        coche.arrancarCoche();
    }
}
