package com.patrones.diseno.estructurales;

/**
 * Patrón Decorator
 *
 * Definición:
 * Permite añadir funcionalidades a un objeto de manera dinámica sin alterar su estructura.
 *
 * Ejemplo de la vida cotidiana:
 * Decorar un regalo: puedes envolverlo con papel, añadirle un lazo, una tarjeta, etc.
 * Cada decoración añade una funcionalidad extra al regalo original.
 */

// Componente
interface Notificador {
    void enviar(String mensaje);
}

// Componente concreto
class NotificadorEmail implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}

// Decorador base
abstract class NotificadorDecorator implements Notificador {
    protected Notificador envoltorio;

    public NotificadorDecorator(Notificador envoltorio) {
        this.envoltorio = envoltorio;
    }

    public void enviar(String mensaje) {
        envoltorio.enviar(mensaje);
    }
}

// Decorador concreto
class NotificadorSMS extends NotificadorDecorator {
    public NotificadorSMS(Notificador envoltorio) {
        super(envoltorio);
    }

    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando SMS: " + mensaje);
    }
}

// Patrón Decorator
public class Decorator {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorSMS(new NotificadorEmail());
        notificador.enviar("¡Hola Decorator!");
    }
}
