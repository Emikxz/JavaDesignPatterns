public class Mago implements InterfazPersonaje{
    @Override
    public void presentacion() {
        System.out.println("Hola, soy un Mago. Soy sabio y poderoso.");
    }

    @Override
    public void mostrarHabilidad() {
        System.out.println("¡Bola de Fuego! ¡Quemo a mis enemigos!");
    }
}
