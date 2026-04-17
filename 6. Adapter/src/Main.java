/**
 * PATRON ADAPTER
 * Tiene como objetivo convertir la interfaz de una clase existente en otra interfaz esperada por el cliente,
 * para que dos partes incompatibles puedan trabajar juntas. También suele describirse como una forma de adaptar
 * un objeto existente sin modificar su código.
 *
 * ¿Qué problema resuelve?
 *  Resuelve casos donde:
 *      * Ya se tiene una clase que funciona bien, pero su interfaz no coincide con la que tu sistema espera,
 *      entonces no se puede usar directamente.
 *      Por ejemplo, un sistema espera un método reproducir() pero una librería externa tiene playAudio().
 *      Las dos hacen casi lo mismo pero hablan distinto.
 *
 * ¿Cuál es la idea central?
 * Se crea una clase intermedia llamada Adapter que:
 *      * implementa la interfaz que el cliente necesita
 *      * por dentro usa el objeto real que ya existe
 *      * traduce una llamada en la otra.
 *  o sea:
 *      * el cliente habla con el adaptador,
 *      * el adaptador habla con la clase vieja o externa,
 *      * así el cliente no necesita cambiar.
 *
 * ESTRUCTURA TÍPICA
 *  1. Cliente
 *      es quien quiere usar algo.
 *  2. Target
 *      es la interfaz que el cliente espera.
 *  3. Adaptee
 *      es la clase ya existente, externa o vieja, con la interfaz incompatibl.
 *  4. Adapter
 *      es la clase puente que traduce entre Target y Adaptee
 *
 *  ¿Qué hace realmente Adapter?
 *  - No agrega una nueva funcionalidad principal como Decorator, ni separa abstracción e implementación como Bridge.
 *  - Lo que hace es traducir interfaces.
 *
 *  Ventajas:
 *      - Reutilizar código
 *      - No modificar una librería externa.
 *      - Desacoplas tu sistema de una interfaz incompatible.
 *      - Se adapta sin tocar la clase original.
 *  Desventajas:
 *      - Agrega una clase más.
 *      Puede hacer el diseño un poco más complejo.
 */

// Ejemplo, tenemos un sistema que tiene una app de música que espera usar
// la interfaz Reproductor con el método reproducir(), pero se tiene una
// librería vieja ParlanteViejo con método encenderYEmitirSonido()
// Como no coinciden, entonces usamos adapter.

// CLASE PRINCIPAL
// Acá probamos el patrón
public class Main {
    public static void main(String[] args) {

        // Creamos el objeto viejo que ya existía
        ParlanteViejo parlanteViejo = new ParlanteViejo();

        // Creamos el adaptador y le pasamos el objeto viejo.
        AdaptadorParlante adaptador = new AdaptadorParlante(parlanteViejo);

        // Creamos el cliente.
        AppMusica appMusica = new AppMusica();

        // El cliente usa la interfaz esperada sin preocuparse de cómo va a funcionar internamente.
        appMusica.iniciarMusica(adaptador);

    }
}