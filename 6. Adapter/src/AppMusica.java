// CLIENTE
// Esta clase representa el código cliente. Solo conoce la interfaz Reproductor.

public class AppMusica {

    // Método que recibe cualquier objeto que implemente Reproductor.
    public void iniciarMusica(Reproductor reproductor) {

        // El cliente no sabe si está usando un objeto normal o un adaptador.
        // Solo sabe que puede llamar a reproducir().
        reproductor.reproducir();
    }

}
