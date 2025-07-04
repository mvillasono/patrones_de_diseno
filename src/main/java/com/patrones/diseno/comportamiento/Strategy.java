package com.patrones.diseno.comportamiento;

/**
 * Patrón Strategy
 *
 * Definición:
 * Permite definir una familia de algoritmos, encapsular cada uno y hacerlos intercambiables.
 *
 * Ejemplo de la vida cotidiana:
 * Un navegador GPS puede calcular la ruta más rápida, más corta o evitar peajes.
 * El usuario puede cambiar la estrategia de cálculo en cualquier momento.
 */

// Estrategia
interface EstrategiaOperacion {
    int operar(int a, int b);
}

// Estrategia concreta: suma
class Suma implements EstrategiaOperacion {
    public int operar(int a, int b) {
        return a + b;
    }
}

// Estrategia concreta: resta
class Resta implements EstrategiaOperacion {
    public int operar(int a, int b) {
        return a - b;
    }
}

// Contexto que usa la estrategia
public class Strategy {
    private EstrategiaOperacion estrategia;

    public void setEstrategia(EstrategiaOperacion estrategia) {
        this.estrategia = estrategia;
    }

    public int ejecutarOperacion(int a, int b) {
        return estrategia.operar(a, b);
    }
}

// Ejemplo de uso del patrón Strategy
class StrategyDemo {
    public static void main(String[] args) {
        Strategy contexto = new Strategy();
        contexto.setEstrategia(new Suma());
        System.out.println("Suma: " + contexto.ejecutarOperacion(5, 3));
        contexto.setEstrategia(new Resta());
        System.out.println("Resta: " + contexto.ejecutarOperacion(5, 3));
    }
}