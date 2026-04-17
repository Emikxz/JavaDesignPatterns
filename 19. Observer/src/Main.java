/**
 * PATRÓN DE COMPORTAMIENTO OBSERVER
 * Es un patrón de comportamiento que define una relación uno a muchos entre objetos:
 *  cuando un objeto principal cambia, notifica automáticamente a todos los objetos que dependen de él.
 *
 * ¿QUÉ PROBLEMA RESUELVE?
 * Resuelve el problema de cuando varios objetos necesitan enterarse de un cambio, pero no se quiere que
 * estén fuertemente acoplados entre sí.
 * Por ejemplo, un producto cambia de precio, varias listas van a tener actualizarse, una muestra el precio
 * en pantalla, otra guarda historial y otra manda una alerta.
 * Sin observer, el objeto principal tendría que conocer demasiado a los demás.
 * Con observer, solo mantiene una lista de observadores y los notifica.
 *
 * Como IDEA CENTRAL, podemos decir que:
 *      * Guarda una lista de observadores,
 *      * Permite agregarlos o quitarlos,
 *      * Cuando cambia algo importante, los recorre y les avisa.
 * Cada observador decide qué hacer cuando recibe la notificación.
 *
 * Estructura Típica:
 *  1. Subject
 *      Es la interfaz o clase que define metodos como:
 *      - agregarObservador()
 *  2. ConcreteSubject
 *      Es el sujeto concreto.
 *      Tiene el estado real que cambia.
 *  3. Observer
 *      Es la interfaz de los observadores, suele tener un método tipo:
 *      - actualizar()
 *  4. ConcreteObserver
 *      Es cada observador concreto, implementa qué hacer cuando el sujeto avisa.
 *
 * Ventajas:
 *      La principal ventaja es que desacopla al sujeto con los objetos que reaccionan a sus cambios.
 *      El sujeto no necesita saber detalles de cada observador, solo que todos implementan la interfaz de observador.
 *      Otra ventaja es que se puede agregar o quitar observadores en tiempo de ejecución sin tocar el código principal.
 * Desventajas:
 *      Puede haber muchas notificaciones innecesarias.
 *      El orden de notificación puede no ser importante o no estar controlado.
 *      Si hay muchos observadores, seguir el flujo del programa puede costar más.
 *
 * EJEMPLO:
 *  Si pensamos en una tienda online de productos de computación.
 *  Hay un producto [NOTEBOOK GAMER]
 *  y hay usuarios suscriptos para enterarse si cambia el precio.
 *  Entonces:
 *      - El producto es el SUJETO.
 *      - Los clientes suscriptos son OBSERVADORES.
 *  Si el precio cambia, el producto notifica a todos los clientes.
 */

// Clase PRINCIPAL para probar todo el patrón.
public class Main {
    // Método principal
    public static void main(String[] args) {

        // Crea el producto que va a ser observado.
        Producto producto = new Producto("Notebook Gamer", 1500.0);

        // Crea dos clientes que observan.
        Cliente cliente1 = new Cliente("Messi");
        Cliente cliente2 = new Cliente("Maradona");

        // Suscribe a ambos clientes al producto.
        producto.addObserver(cliente1);
        producto.addObserver(cliente2);

        // Cambia el precio lo que va a hacer que se envíe la notificación
        producto.setPrecio(1400.0);

        System.out.println();

        // Se elimina un observador.
        producto.delObserver(cliente2);

        // Se vuelve a cambiar el precio
        producto.setPrecio(1300.0);
    }
}