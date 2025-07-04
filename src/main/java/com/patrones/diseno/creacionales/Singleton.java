package com.patrones.diseno.creacionales;

/**
 * Patrón Singleton
 *
 * Definición:
 * Garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a ella.
 *
 * Ejemplo de la vida cotidiana:
 * El presidente de un país: solo puede haber uno en un momento dado.
 * Si alguien pide el presidente, siempre se obtiene la misma persona.
 */

// Patrón Singleton
public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Hola desde Singleton!");
    }

    // Ejemplo de uso del patrón Singleton
    public static void main(String[] args) {
        Singleton instancia1 = Singleton.getInstancia();
        Singleton instancia2 = Singleton.getInstancia();
        instancia1.mostrarMensaje();
        System.out.println("¿Es la misma instancia? " + (instancia1 == instancia2));
    }
}
