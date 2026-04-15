
public class BuilderDirector {

    private BuilderCasa builder;

    // Constructor propio de la clase.
    public BuilderDirector(BuilderCasa builder) {
        this.builder = builder;
    }

    // Cambiar de constructor.
    public void changeBuilder(BuilderCasa builder) {
        this.builder = builder;
    }

    // Casa de material, de 2 pisos con garage (sin piscina), con jardin.
    public void buildTwoStoryHouseWGarageAndGarden() {
        builder.reiniciar();
        builder.construirEstructura("Material");
        builder.construirPisos(2);
        builder.construirGarage(true);
        builder.construirPileta(false);
        builder.construirJardin(true);
        builder.agregarExtra("Balcon");
    }

    // Casa de material, 1 piso, con pileta, jardin y garage.
    public void build1StoryWPoolGardenAndGarage() {
        builder.reiniciar();
        builder.construirEstructura("Material");
        builder.construirPisos(1);
        builder.construirGarage(true);
        builder.construirPileta(true);
        builder.construirJardin(true);
        builder.agregarExtra("Quincho");
    }

    // Casa madera simple con jardin.
    public void buildWoodenHouseWGarden() {
        builder.reiniciar();
        builder.construirEstructura("Madera");
        builder.construirPisos(1);
        builder.construirPileta(false);
        builder.construirGarage(false);
        builder.construirJardin(true);
    }

}
