package com.patrones.diseno.estructurales;

import java.util.ArrayList;
import java.util.List;

/**
 * Patrón Composite
 *
 * Definición:
 * Permite tratar objetos individuales y composiciones de objetos de manera uniforme.
 *
 * Ejemplo de la vida cotidiana:
 * Una carpeta puede contener archivos y otras carpetas.
 * Puedes realizar operaciones (como mostrar contenido) tanto en archivos como en carpetas de la misma forma.
 */

// Componente
interface Componente {
    void mostrar();
}

// Hoja
class Hoja implements Componente {
    private String nombre;
    public Hoja(String nombre) { this.nombre = nombre; }
    public void mostrar() { System.out.println(nombre); }
}

// Compuesto
class Compuesto implements Componente {
    private List<Componente> hijos = new ArrayList<>();
    public void agregar(Componente c) { hijos.add(c); }
    public void mostrar() {
        for (Componente c : hijos) c.mostrar();
    }
}

// Patrón Composite
public class Composite {
    public static void main(String[] args) {
        Compuesto raiz = new Compuesto();
        raiz.agregar(new Hoja("Hoja 1"));
        raiz.agregar(new Hoja("Hoja 2"));
        Compuesto subCompuesto = new Compuesto();
        subCompuesto.agregar(new Hoja("Hoja 3"));
        raiz.agregar(subCompuesto);
        raiz.mostrar();
    }
}
