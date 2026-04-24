Supongamos que en nuestro videojuego en un primer momento solo tenemos una clase de personaje disponible (guerrero), pero con el tiempo queremos agregar nuevas clases para nuestros personajes, como por ejemplo un mago.



En un primer momento, el codigo estaria acoplado a la clase Guerrero, por lo que si queremos agregar mas personajes tendriamos que hacer muchos cambios que podrian afectar el comportamiento de nuestro juego.



Usamos el patron Factory method para que en lugar de llamar al operador **new** para construir un objeto directamente, invoquemos un método fabrica especial, que sigue utilizando el operador **new**, pero se invoca desde el método fabrica. 

Los objetos devueltos por este método se llaman productos.



**1. Producto (InterfazPersonaje):**
El archivo *InterfazPersonaje.java* define el contrato. Todos los personajes del juego, sin importar su tipo, deben ser capaces de presentarse y mostrar su habilidad.



Código: public interface InterfazPersonaje { 
void presentacion(); 

void mostrarHabilidad(); 

}.



**2. Productos Concretos (Las Implementaciones)**

Aquí tenemos las clases reales que representan a los personajes:



Guerrero: Define su propia presentación y su ataque de "Espada de Hierro".



Mago: Define su presentación como alguien sabio y su ataque de "Bola de Fuego".



**3. El Creador (La Clase Abstracta)**

El archivo ClasePersonaje.java es el corazón del patrón.



*Factory Method*: Define el método abstracto **UsarPersonaje()**. Este método es la "fábrica" que devolverá un objeto de tipo **InterfazPersonaje**, pero no dice cuál.



Lógica de Operación: El método **mostrarPersonaje()** utiliza el objeto creado por la fábrica para llamar a sus métodos, sin saber si es un Mago o un Guerrero.


**4. Creadores Concretos (Los Jugadores)**

Aquí es donde se decide qué personaje se crea realmente:



**Jugador1**: Implementa la fábrica para devolver siempre un Guerrero.



**Jugador2**: Implementa la fábrica para devolver siempre un Mago.



**Funcionamiento (Main.java):**



En el archivo Main.java, el sistema interactúa con los jugadores de forma genérica:



Se crean instancias de Jugador1 y Jugador2, pero se guardan en variables de tipo **ClasePersonaje**.



Al llamar a **jugador1.mostrarPersonaje()**, el código de la superclase ejecuta **UsarPersonaje()**, el cual gracias al polimorfismo invoca la versión del Jugador1 y crea al Guerrero.



Lo mismo ocurre con el Jugador2, pero este crea al Mago.



&#x20;Si quisieramos agregar un "Arquero", solo tendrías que crear la clase Arquero y un Jugador3. No necesitamos modificar ni una sola línea de ClasePersonaje.java ni la lógica principal de presentación.

