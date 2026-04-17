/**
 * MEDIATOR
 * El patrón MEDIATOR sirve para centralizar la comunicación entre varios objetos,
 * evitando que todos se conozcan y se hablen directamente entre sí.
 * Define un objeto que encapsula cómo interactúa un conjunto de objetos para reducir el acoplamiento.
 * La idea es evitar que los objetos hablen entre ellos, los objetos deben hablar con un intermediario.
 *
 * ¿Qué hace exactamente?
 * El mediator recibe eventos o cambios de un objeto, decide cómo reaccionar y coordina al resto de los objetos.
 * O sea, actúa como un centro de control.
 *
 * Estructura típica:
 *  1. Mediator: es la interfaz o clase abstracta del mediador.
 *  2. ConcreteMediator: es el mediador concreto que conoce a los objetos y coordina sus interacciones.
 *  3. Colleague: Son los objetos que participan (cada uno conoce al mediador, le avisa cuando pasa algo y no necesita
 *      conocer a sus colegas directamente.)
 *
 * Ventaja Principal:
 *  Reduce el acoplamiento entre los objetos, cada objeto no debe saber cómo funcionan los demás.
 *  Centraliza la lógica de interacciones, en vez de tener reglas repartidas, las tenemos en un mediador.
 *
 * Desventaja Principal:
 *  El mediador puede crecer demasiado, si le metemos muchas responsabilidades, termina siendo una clase grande y
 *  difícil de mantener.
 *
 * ¿Cuándo conviene usarlo?
 *  Cuando hay muchos objetos que interactúan entre sí.
 *  Cuando las reglas de interacción son complejas.
 *  Cuando se quiere evitar una red caótica de dependencias.
 *
 *  Ejemplo:
 *   Un formulario de login:
 *      * CajaUser
 *      * CajaPassword
 *      * LogInButton
 *   Regla:
 *      * El botón solo se habilita si usuario y contraseña tienen texto.
 *   Sin Mediator:
 *      * Cada caja tendría que conocer al botón y probablemente a la otra caja.
 *   Con Mediator:
 *      * Cada caja le avisa al mediador cuando cambia.
 *      * El mediador revisa el estado general y decide si habilita o no el botón.
 */

// CLASE PRINCIPAL, DESDE ACA VAMOS A PROBAR EL EJEMPLO QUE HICIMOS.
public class Main {
    public static void main(String[] args) {

        // Crea el mediador concreto.
        MediadorLogin mediador = new MediadorLogin();

        // Crea la caja de usuario y de password y le pasa mediador.
        CajaUsuario cajaUsuario = new CajaUsuario(mediador);
        CajaPassword cajaPassword = new CajaPassword(mediador);

        // Crea el botón de login.
        BotonLogIn botonLogIn = new BotonLogIn();

        // Le dice al mediador cuál es la caja de usuario y cuál de contraseña y cuál el botón de login.
        mediador.setCajaUsuario(cajaUsuario);
        mediador.setCajaPassword(cajaPassword);
        mediador.setBotonLogIn(botonLogIn);

        // Intenta hacer click sin haber completado los campos de password y user.
        System.out.println("\nSi el usuario intenta hacer click sin haber completado los campos: ");
        botonLogIn.click();

        // Si ahora, el usuario escribe solo el nombre de usuario y luego intenta hacer click en login.
        System.out.println("\nUsuario escribe solo el campo usuario e intenta hacer click:");
        cajaUsuario.escribir("UnViMe");
        botonLogIn.click();

        // Por último, el usuario escribe la contraseña y luego intenta hacer click.
        System.out.println("\nUsuario escribe ahora también la contraseña e intenta hacer click:");
        cajaPassword.escribir("123");
        botonLogIn.click();

    }
}