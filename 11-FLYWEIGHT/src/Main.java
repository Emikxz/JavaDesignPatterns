/*PATRON FLYWEIGHT DE TIPO ESTRUCTURAL
este patron buscar optimizar cuando se necesitan crear varios objetos muy similares,esto lo podemos ver
en juegos,donde usamos arboles o tambien lo podemos ver en objetos que tengan muchas similitudes
el objetivo de este es solo guardar los atributos intrinsecos y los atributos extrinsecos son los parametros
que no guardamos pero los usamos en los metodos,cada vez que creamos un objeto con atributos intrisecos
diferente lo crea nuevo y lo guarda como un nuevo tipo,al comienzo es muy problable que se creen siempre nuevos
tipo pero a medida que esto va escalando se reutiliza el objeto
 */
public class Main {
    public static void main(String[] args) {
        ArbolFactory factory = new ArbolFactory();

        // Pedimos varios árboles iguales
        TipoDeArbol arbol1 = factory.obtenerArbol("Pino", "Verde", "Rugosa");
        TipoDeArbol arbol2 = factory.obtenerArbol("Pino", "Verde", "Rugosa");
        TipoDeArbol arbol3 = factory.obtenerArbol("Pino", "Verde", "Rugosa");

        //los usamos con distintos datos (extrínsecos)
        arbol1.dibujar(10, 20, 5);
        arbol2.dibujar(30, 40, 10);
        arbol3.dibujar(50, 60, 15);

        // Otro tipo distinto
        TipoDeArbol arbol4 = factory.obtenerArbol("Roble", "Oscuro", "Lisa");
        arbol4.dibujar(70, 80, 20);

        //comprobar si son el mismo objeto
        System.out.println("¿arbol1 y arbol2 son el mismo objeto?");
        System.out.println(arbol1 == arbol2); // debería dar true

        System.out.println("¿arbol1 y arbol4 son el mismo objeto?");
        System.out.println(arbol1 == arbol4); // debería dar false
}
}
