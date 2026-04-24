
/* ABSTRACT FACTORY ES UN PATRON DE DISEÑO CREACIONAL
 Permite producir familias de objetos relacionados sin especificar clases concretas.
esto se usa para crear objetos segun el contexto,es similar a Factory method pero vez de crear solo
1 objeto este crea familia de objetos relacionados ejemplo jean y pantalon
 */
public class Main {
    public static void main(String[] args) {

        // Seleccionamos una familia de productos.
        OutfitFactory factory = new OutfitUrbanoFactory();

        // Cliente trabaja o va a interactuar sin saber las clases concretas.
        TiendaRopa tienda = new TiendaRopa(factory);
        tienda.mostrarOutfit();

        //creamos otra tienda
        OutfitFactory factory2 = new OutfitEleganteFactory();
        TiendaRopa tienda2 =new TiendaRopa(factory2);
        tienda2.mostrarOutfit();
    }
}
