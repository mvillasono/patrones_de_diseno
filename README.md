# 🧠 Patrones de Diseño en Java y Spring

## ¿Qué son los patrones de diseño?
Los **patrones de diseño** son soluciones reutilizables a problemas comunes en el diseño de software.  
Sirven como **guías** para organizar clases, interfaces y objetos, haciendo el código:

- ✅ Más mantenible  
- ✅ Más escalable  
- ✅ Más legible  
- ✅ Más fácil de probar  
- ✅ Más profesional y estándar  

---

## 🔧 Tipos de patrones

### 1. Patrones **Creacionales**
> Se encargan de la creación de objetos.

### 2. Patrones **Estructurales**
> Tratan sobre la composición de clases u objetos para formar estructuras más grandes.

### 3. Patrones **de Comportamiento**
> Definen cómo interactúan los objetos entre sí.

---

## 🎯 ¿Para qué me sirven?

| Beneficio                  | Ejemplo realista                                           |
|---------------------------|-------------------------------------------------------------|
| Evitar código duplicado   | En lugar de repetir lógica para crear objetos → **Builder** |
| Separar responsabilidades | Cada clase hace una sola cosa → **Strategy**, **Observer** |
| Flexibilizar cambios      | Si cambias de canal de notificación → **Factory**          |
| Facilitar pruebas unitarias | Puedes inyectar objetos falsos (mocks) fácilmente          |
| Seguir buenas prácticas   | Lo que los equipos grandes y expertos ya aplican           |
| Entender código de otros  | Muchos frameworks (como Spring) ya usan estos patrones     |

---

## 📌 ¿Dónde se aplican?

> Los patrones no son clases mágicas, sino formas de **estructurar tus clases y relaciones**.

| Patrón            | Se aplica a...                                               |
|-------------------|--------------------------------------------------------------|
| Singleton         | Clases con una única instancia                               |
| Factory           | Clases o interfaces que crean otros objetos                 |
| Strategy          | Interfaces + clases que definen comportamientos             |
| Observer          | Clases que notifican a otras automáticamente                |
| Decorator         | Clases que envuelven a otras (composición)                  |
| Template Method   | Superclases abstractas y subclases concretas                |
| Proxy             | Clases que actúan como intermediarios                        |

---

## 🔄 ¿Cómo usar esto en tus proyectos?

| Necesidad                          | Patrón sugerido             |
|-----------------------------------|-----------------------------|
| Reutilizar una única instancia    | Singleton                   |
| Elegir servicio por tipo          | Factory                     |
| Registrar logs o métricas         | Proxy (AOP)                 |
| Reaccionar a eventos              | Observer                    |
| Crear objetos complejos           | Builder                     |
| Validaciones o filtros            | Chain of Responsibility     |
| Encapsular acceso a API/db        | Template Method             |

---

## ✅ ¿Cuáles son más usados en Java y Spring?

| Framework        | Patrones comunes                                                  |
|------------------|--------------------------------------------------------------------|
| Java básico      | Singleton, Factory, Builder                                       |
| Spring Boot      | Singleton, Proxy (AOP), Template Method (`JdbcTemplate`), Observer |
| JPA              | Strategy, Proxy, Template Method                                  |
| Microservicios   | Facade, Adapter, Chain of Responsibility                          |

---

## 🏗️ ¿Ayudan a estructurar el proyecto?

Sí, indirectamente. No reemplazan a una arquitectura (como **microservicios** o **MVC**), pero:

- Ayudan a estructurar el código dentro de cada capa (`service`, `controller`, `repository`)
- Refuerzan principios **SOLID**
- Crean un código más claro y con menos dependencias innecesarias

### Ejemplo en un microservicio REST con Spring Boot:

- `Factory` en la capa de servicios → para elegir lógica dinámicamente  
- `Strategy` para reglas de negocio → como descuentos, cálculos por tipo  
- `Observer` para lanzar eventos → como “usuario creado” o “petición finalizada”  
- `Proxy` para logs o validaciones antes de ejecutar una función  

---

## 🧠 En resumen:

### ❓ ¿Para qué sirven los patrones de diseño?
✅ Para que tu código sea más **mantenible**, **flexible** y **profesional**.

### ❓ ¿Dónde se aplican?
✅ Se usan en **clases, interfaces, servicios**, ¡en todo el diseño de tu software!

### ❓ ¿Son obligatorios?
🚫 No, pero son **altamente recomendados**, especialmente si quieres que tu código crezca y sea entendible por otros (¡o por ti mismo en 6 meses!).

---

> ✨ Si entiendes los patrones de diseño, entiendes mejor tu código, el de otros, y el de los frameworks que usas.
