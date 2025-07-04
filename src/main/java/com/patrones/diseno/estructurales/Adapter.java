package com.patrones.diseno.estructurales;

/**
 * Patrón Adapter
 *
 * Definición:
 * Permite que la interfaz de una clase sea compatible con otra interfaz esperada.
 * El Adapter envuelve un objeto existente con una nueva interfaz.
 *
 * Ejemplo de la vida cotidiana:
 * Un adaptador de enchufe permite conectar un dispositivo europeo en un tomacorriente americano.
 * El adaptador traduce la forma del enchufe para que sea compatible.
 */

// Interfaz objetivo
interface Enchufe {
    void conectar();
}

// Clase existente incompatible
class EnchufeEuropeo {
    public void conectarEuropeo() {
        System.out.println("Conectado con enchufe europeo.");
    }
}

// Adaptador que permite usar EnchufeEuropeo como Enchufe
public class Adapter implements Enchufe {
    private EnchufeEuropeo enchufeEuropeo;

    public Adapter(EnchufeEuropeo enchufeEuropeo) {
        this.enchufeEuropeo = enchufeEuropeo;
    }

    @Override
    public void conectar() {
        enchufeEuropeo.conectarEuropeo();
    }
}
