public class Guerrero implements InterfazPersonaje {
    @Override
    public void presentacion() {
        System.out.println("Hola, soy un Guerrero. Soy fuerte y valiente.");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("¡Espada de Hierro! ¡Corto con fuerza!");
    }
}


