public class Main {
    public static void main(String[] args) {
        ClasePersonaje jugador1 = new Jugador1();
        ClasePersonaje jugador2 = new Jugador2();

        System.out.println("Jugador 1:");
        jugador1.mostrarPersonaje();

        System.out.println("\nJugador 2:");
        jugador2.mostrarPersonaje();
    }
}
