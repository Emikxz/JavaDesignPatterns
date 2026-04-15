/*
* PATRON BUILDER
* Es un patrón de diseño creacional que permite construir objetos complejos paso a paso.
* Su objetivo es que mediante el mismo proceso de construcción, se puedan obtener distintas
* representaciones variantes del objeto final
*/

public class Main {
    public static void main(String[] args) {

        // Builder Concreto
        BuilderConcretoCasa builder = new BuilderConcretoCasa();

        // Director (opcional)
        BuilderDirector director = new BuilderDirector(builder);

        // Creando los objetos
        director.buildTwoStoryHouseWGarageAndGarden();
        Casa casa1 = builder.obtenerResultado();
        System.out.println("\n\nCasa 1: " + casa1.toString());

        director.build1StoryWPoolGardenAndGarage();
        Casa casa2 = builder.obtenerResultado();
        System.out.println("\n\nCasa 2: " + casa2.toString());

        director.buildWoodenHouseWGarden();
        Casa casa3 = builder.obtenerResultado();
        System.out.println("\n\nCasa 3: " + casa3.toString());

        //-----------------------------------------------------
        // El caso de no usar el director.
        builder.reiniciar();
        builder.construirEstructura("Material");
        builder.construirPisos(5);
        builder.agregarExtra("Parrila para asado");
        Casa casa4 = builder.obtenerResultado();
        System.out.println("\n\nCasa 4: " + casa4.toString());
    }
}