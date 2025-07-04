package com.patrones.diseno.comportamiento;

/**
 * Patrón Template Method
 * 
 * Definición:
 * El patrón Template Method define el esqueleto de un algoritmo en una operación, 
 * delegando algunos pasos a las subclases. Permite que las subclases redefinan ciertos pasos 
 * de un algoritmo sin cambiar la estructura del mismo.
 * 
 * Ejemplo de la vida cotidiana:
 * Preparar una bebida caliente (como café o té) sigue una serie de pasos generales:
 * 1. Hervir agua
 * 2. Añadir el ingrediente principal (café o té)
 * 3. Servir en una taza
 * 4. Añadir extras (azúcar, leche, etc.)
 * 
 * La estructura general es la misma, pero el paso de añadir el ingrediente principal 
 * varía según la bebida. El método plantilla define el proceso general, y las subclases 
 * implementan los pasos específicos.
 */

// Clase abstracta con el método plantilla
abstract class Juego {
    abstract void iniciar();
    abstract void finalizar();

    // Método plantilla
    public final void jugar() {
        iniciar();
        System.out.println("Jugando...");
        finalizar();
    }
}

// Implementación concreta
class Futbol extends Juego {
    void iniciar() { System.out.println("Iniciando fútbol"); }
    void finalizar() { System.out.println("Finalizando fútbol"); }
}

// Patrón Template Method
public class TemplateMethod {
    public static void main(String[] args) {
        Juego juego = new Futbol();
        juego.jugar();
    }
}
