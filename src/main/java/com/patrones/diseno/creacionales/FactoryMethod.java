package com.patrones.diseno.creacionales;

/**
 * Patrón Factory Method
 *
 * Definición:
 * Permite definir una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar.
 * El Factory Method permite a una clase delegar la instanciación a las subclases.
 *
 * Ejemplo de la vida cotidiana:
 * Imagina una fábrica de vehículos. Dependiendo del tipo de fábrica (de autos o de motos), 
 * el método de creación produce un tipo de vehículo diferente, pero el proceso de fabricación es similar.
 * Así, puedes pedirle a la fábrica que cree un vehículo sin preocuparte por el tipo concreto.
 */

// Producto
interface Producto {
    void operacion();
}

// Producto concreto A
class ProductoA implements Producto {
    public void operacion() {
        System.out.println("Operación de Producto A");
    }
}

// Producto concreto B
class ProductoB implements Producto {
    public void operacion() {
        System.out.println("Operación de Producto B");
    }
}

// Creador abstracto
abstract class Creador {
    public abstract Producto crearProducto();
}

// Creador concreto A
class CreadorA extends Creador {
    public Producto crearProducto() {
        return new ProductoA();
    }
}

// Creador concreto B
class CreadorB extends Creador {
    public Producto crearProducto() {
        return new ProductoB();
    }
}

// Patrón Factory Method
public class FactoryMethod {
    public static void main(String[] args) {
        Creador creador = new CreadorA();
        Producto producto = creador.crearProducto();
        producto.operacion();

        creador = new CreadorB();
        producto = creador.crearProducto();
        producto.operacion();
    }
}
