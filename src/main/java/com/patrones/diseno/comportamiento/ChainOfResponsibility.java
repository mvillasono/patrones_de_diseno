package com.patrones.diseno.comportamiento;

/**
 * Patrón Chain of Responsibility
 *
 * Definición:
 * Permite pasar una petición a lo largo de una cadena de manejadores hasta que uno la procese.
 *
 * Ejemplo de la vida cotidiana:
 * En una empresa, una solicitud puede pasar del empleado al jefe de área, luego al gerente, hasta que alguien la resuelva.
 */

// Manejador
abstract class Manejador {
    protected Manejador siguiente;

    public void setSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejar(String mensaje);
}

// Manejador concreto
class ManejadorConcretoA extends Manejador {
    public void manejar(String mensaje) {
        if (mensaje.equals("A")) {
            System.out.println("Manejador A procesó el mensaje");
        } else if (siguiente != null) {
            siguiente.manejar(mensaje);
        }
    }
}

class ManejadorConcretoB extends Manejador {
    public void manejar(String mensaje) {
        if (mensaje.equals("B")) {
            System.out.println("Manejador B procesó el mensaje");
        } else if (siguiente != null) {
            siguiente.manejar(mensaje);
        }
    }
}

// Patrón Chain of Responsibility
public class ChainOfResponsibility {
    public static void main(String[] args) {
        Manejador a = new ManejadorConcretoA();
        Manejador b = new ManejadorConcretoB();
        a.setSiguiente(b);

        a.manejar("A");
        a.manejar("B");
        a.manejar("C");
    }
}
