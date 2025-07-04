package com.patrones.diseno.comportamiento;

/**
 * Patrón Visitor
 *
 * Definición:
 * Permite definir nuevas operaciones sin cambiar las clases de los elementos sobre los que opera.
 *
 * Ejemplo de la vida cotidiana:
 * Un inspector visita diferentes departamentos de una empresa y realiza diferentes acciones en cada uno.
 */

// Elemento
interface Elemento {
    void aceptar(Visitante visitante);
}

// Elemento concreto
class ElementoConcreto implements Elemento {
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
}

// Visitante
interface Visitante {
    void visitar(ElementoConcreto elemento);
}

// Visitante concreto
class VisitanteConcreto implements Visitante {
    public void visitar(ElementoConcreto elemento) {
        System.out.println("Visitando elemento concreto");
    }
}

// Patrón Visitor
public class Visitor {
    public static void main(String[] args) {
        Elemento elemento = new ElementoConcreto();
        Visitante visitante = new VisitanteConcreto();
        elemento.aceptar(visitante);
    }
}
