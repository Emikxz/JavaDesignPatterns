/*
* PATRÓN PROTOTYPE
* Es una patrón de diseño creacional cuyo objetivo es crear nuevos objetos copiando (clonando)
* instancias existentes.
* ¿Qué problema resuelve?
* Imaginá que tenés un objeto muy complejo (muchos campos o configuraciones) y necesitás
* crear uno nuevo que se parezca mucho al original, pero que cambie solo algunos detalles,
* ahí entra en juego Prototype.
* */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // a. Crear prototipo base. ("plantilla" de nuestra pizza)
        PizzaOrder muzzaPrototype = new PizzaOrder("8 Porciones", "Normal", List.of("Muzarella", "Salsa de Tomate"));

        // b. Variante clon con aceitunas.
        PizzaOrder olivesMuzza = muzzaPrototype.clonar();
        olivesMuzza.addIngredients("Aceitunas");

        // c. Otra variante con jamón
        PizzaOrder hamMuzza = muzzaPrototype.clonar();
        hamMuzza.addIngredients("Jamón");

        // d. Variante especial
        SpecialPizzaOrder specialPrototype = new SpecialPizzaOrder("12 Porciones", "Masa fina", List.of("Muzarella", "Salsa"), true);
        SpecialPizzaOrder specialWithRucula = specialPrototype.clonar();
        specialWithRucula.addIngredients("Rúcula");

        // Resultados
        System.out.println("\nPrototipo base: " + muzzaPrototype);
        System.out.println("\nVariante con Aceitunas: " + olivesMuzza);
        System.out.println("\nVariante con Jamón: " + hamMuzza);
        System.out.println("\nPrototipo Especial: " + specialPrototype);
        System.out.println("\nEspecial con Rúcula: " + specialWithRucula);
    }
}