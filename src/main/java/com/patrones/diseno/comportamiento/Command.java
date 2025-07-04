package com.patrones.diseno.comportamiento;

/**
 * Patrón Command
 *
 * Definición:
 * Encapsula una petición como un objeto, permitiendo parametrizar clientes con diferentes peticiones.
 *
 * Ejemplo de la vida cotidiana:
 * Un botón de control remoto puede encender o apagar la luz, cada acción es un comando diferente.
 */

// Comando
interface Comando {
    void ejecutar();
}

// Receptor
class Luz {
    void encender() { System.out.println("Luz encendida"); }
}

// Comando concreto
class EncenderLuz implements Comando {
    private Luz luz;
    public EncenderLuz(Luz luz) { this.luz = luz; }
    public void ejecutar() { luz.encender(); }
}

// Invocador
class Interruptor {
    private Comando comando;
    public Interruptor(Comando comando) { this.comando = comando; }
    public void presionar() { comando.ejecutar(); }
}

// Patrón Command
public class Command {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Comando encender = new EncenderLuz(luz);
        Interruptor interruptor = new Interruptor(encender);
        interruptor.presionar();
    }
}
