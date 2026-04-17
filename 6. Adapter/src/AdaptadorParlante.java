// ADAPTER
// Esta clase adapta ParlanteViejo a la interfaz Reproductor.
// Implementa la interfaz esperada por el cliente, pero por dentro usa un objeto de la clase vieja.

public class AdaptadorParlante implements Reproductor {

    // Referencia al objeto que queremos adaptar.
    private ParlanteViejo parlanteViejo;

    // Constructor
    public AdaptadorParlante(ParlanteViejo parlanteViejo) {

        // Guarda la referencia al objeto real.
        this.parlanteViejo = parlanteViejo;
    }

    // Implementación del método que el cliente espera.
    @Override
    public void reproducir() {

        // Traduce la llamada "reproducir()" a la llamada real que entiende el objeto viejo.
        parlanteViejo.encenderYEmitirSonido();
    }
}
