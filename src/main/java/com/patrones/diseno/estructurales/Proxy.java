package com.patrones.diseno.estructurales;

/**
 * Patrón Proxy
 *
 * Definición:
 * Proporciona un sustituto o representante de otro objeto para controlar el acceso a él.
 *
 * Ejemplo de la vida cotidiana:
 * Un guardaespaldas actúa como intermediario entre una persona importante y el público,
 * controlando quién puede acercarse a ella.
 */

// Interfaz
interface Servicio {
    void operacion();
}

// Servicio real
class ServicioReal implements Servicio {
    public void operacion() {
        System.out.println("Operación real ejecutada");
    }
}

// Proxy
class ServicioProxy implements Servicio {
    private ServicioReal servicioReal;

    public void operacion() {
        if (servicioReal == null) {
            servicioReal = new ServicioReal();
        }
        System.out.println("Proxy: control de acceso");
        servicioReal.operacion();
    }
}

// Patrón Proxy
public class Proxy {
    public static void main(String[] args) {
        Servicio servicio = new ServicioProxy();
        servicio.operacion();
    }
}
