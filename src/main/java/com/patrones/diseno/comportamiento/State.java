package com.patrones.diseno.comportamiento;

/**
 * Patrón State
 *
 * Definición:
 * Permite a un objeto cambiar su comportamiento cuando cambia su estado interno.
 *
 * Ejemplo de la vida cotidiana:
 * Un semáforo cambia su comportamiento (luz verde, amarilla, roja) dependiendo de su estado.
 */

// Estado
interface Estado {
    void manejar();
}

// Estado concreto
class EstadoEncendido implements Estado {
    public void manejar() {
        System.out.println("Estado: Encendido");
    }
}

class EstadoApagado implements Estado {
    public void manejar() {
        System.out.println("Estado: Apagado");
    }
}

// Contexto
class Contexto {
    private Estado estado;
    public void setEstado(Estado estado) { this.estado = estado; }
    public void solicitar() { estado.manejar(); }
}

// Patrón State
public class State {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        contexto.setEstado(new EstadoEncendido());
        contexto.solicitar();
        contexto.setEstado(new EstadoApagado());
        contexto.solicitar();
    }
}
