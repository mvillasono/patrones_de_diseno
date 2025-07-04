package com.patrones.diseno.comportamiento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Patrón Iterator
 *
 * Definición:
 * Permite recorrer los elementos de una colección sin exponer su representación interna.
 *
 * Ejemplo de la vida cotidiana:
 * Un control remoto de televisión permite recorrer los canales uno a uno sin saber cómo están almacenados.
 */

// Patrón Iterator usando la interfaz de Java
public class Iterador {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
