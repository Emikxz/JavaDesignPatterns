/*
 ABSTRACT FACTORY ES UN PATRON DE DISEÑO CREACIONAL
 Permite producir familias de objetos relacionados sin especificar clases concretas.

 En la práctica, actúa como una fábrica de fábricas, una fábrica abstracta puede generar distintas fábricas concretas,
 cada una encargada de crear productos o concretos correspondientes a una variante o familiar particular.
*/

public class Main {
    public static void main(String[] args) {

        // Seleccionamos una familia de productos.
        OutfitFactory factory = new OutfitUrbanoFactory();

        // Cliente trabaja o va a interactuar sin saber las clases concretas.
        TiendaRopa tienda = new TiendaRopa(factory);
        tienda.mostrarOutfit();

        // Lo hago ahora con otra tienda supongamos...
        OutfitFactory factory2 = new OutfitEleganteFactory();

        TiendaRopa otraTienda = new TiendaRopa(factory);
        otraTienda.mostrarOutfit();

    }
}

/*
 ¿Qué problema resuelve Abstract Factory?
 Resuelve el problema de crear familias de objetos relacionados o compatibles entre sí
 sin acoplar el código cliente a sus clases concretas.
 Por ejemplo, si tenemos un producto "Silla de PC" podemos tener distintas variantes: Gamer, Oficina, Ergonómica, etc...
 Abstract Factory permite que cada variante de un producto tenga su propia fábrica concreta sin modificar el código cliente.

 ¿Entonces Abstract Factory utiliza el patrón Factory Method?
 Sí. En la mayoría de implementaciones, Abstract Factory se apoya internamente en uno o varios Factory Method para crear
 los productos concretos.
 Abstract Factory está construido sobre Factory Method: cada método de una fábrica concreta suele ser un Factory Method
 encargado de crear un producto de la familia.
 */