package com.patrones.diseno.creacionales;

/**
 * Patrón Builder
 *
 * Definición:
 * Separa la construcción de un objeto complejo de su representación, permitiendo crear diferentes representaciones.
 *
 * Ejemplo de la vida cotidiana:
 * Un chef puede preparar una hamburguesa de diferentes maneras (con queso, sin cebolla, etc.),
 * pero el proceso de preparación es el mismo.
 */

// Producto complejo
class Persona {
    private String nombre;
    private int edad;

    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
    }

    public String toString() {
        return nombre + " (" + edad + ")";
    }

    // Builder
    public static class Builder {
        private String nombre;
        private int edad;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }
    }
}

// Patrón Builder
public class Builder {
    public static void main(String[] args) {
        Persona persona = new Persona.Builder()
            .nombre("Juan")
            .edad(30)
            .build();
        System.out.println(persona);
    }
}
