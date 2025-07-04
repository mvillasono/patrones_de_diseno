package com.patrones.diseno.comportamiento;

/**
 * Patrón Mediator
 *
 * Definición:
 * Define un objeto que encapsula cómo interactúan un conjunto de objetos.
 *
 * Ejemplo de la vida cotidiana:
 * Un controlador aéreo coordina la comunicación entre varios aviones para evitar colisiones.
 */

// Mediador
interface Mediador {
    void enviar(String mensaje, Colega colega);
}

// Colega
abstract class Colega {
    protected Mediador mediador;
    public Colega(Mediador mediador) { this.mediador = mediador; }
    public abstract void recibir(String mensaje);
}

// Colega concreto
class ColegaConcreto extends Colega {
    public ColegaConcreto(Mediador mediador) { super(mediador); }
    public void recibir(String mensaje) {
        System.out.println("Colega recibió: " + mensaje);
    }
    public void enviar(String mensaje) {
        mediador.enviar(mensaje, this);
    }
}

// Mediador concreto
class MediadorConcreto implements Mediador {
    private ColegaConcreto colega1;
    private ColegaConcreto colega2;

    public void setColegas(ColegaConcreto c1, ColegaConcreto c2) {
        this.colega1 = c1;
        this.colega2 = c2;
    }

    public void enviar(String mensaje, Colega colega) {
        if (colega == colega1) {
            colega2.recibir(mensaje);
        } else {
            colega1.recibir(mensaje);
        }
    }
}

// Patrón Mediator
public class Mediator {
    public static void main(String[] args) {
        MediadorConcreto mediador = new MediadorConcreto();
        ColegaConcreto c1 = new ColegaConcreto(mediador);
        ColegaConcreto c2 = new ColegaConcreto(mediador);
        mediador.setColegas(c1, c2);

        c1.enviar("Hola desde c1");
        c2.enviar("Hola desde c2");
    }
}
