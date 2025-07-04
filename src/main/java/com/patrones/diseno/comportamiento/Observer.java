package com.patrones.diseno.comportamiento;

import java.util.ArrayList;
import java.util.List;

/**
 * Patrón Observer
 *
 * Definición:
 * Permite que un objeto notifique cambios a otros objetos que están observando su estado.
 *
 * Ejemplo de la vida cotidiana:
 * Un canal de YouTube notifica a sus suscriptores cada vez que sube un nuevo video.
 */

// Observador
interface Observador {
    void actualizar(String mensaje);
}

// Sujeto
class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}

// Observador concreto
class ObservadorConcreto implements Observador {
    private String nombre;

    public ObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}

// Patrón Observer
public class Observer {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();
        sujeto.agregarObservador(new ObservadorConcreto("Observer 1"));
        sujeto.agregarObservador(new ObservadorConcreto("Observer 2"));

        sujeto.notificar("¡Hola Observers!");
    }
}
