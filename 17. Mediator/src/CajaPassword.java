// Esta clase representa la caja de la contraseña.
// Igual que la anterior, no conoce al botón ni a la otra caja, solo al mediator.

public class CajaPassword {

    // Guarda la contraseña escrita
    private String texto;

    // Guarda una referencia al mediator.
    private Mediator mediator;

    // Constructor
    public CajaPassword(Mediator mediator) {

        // Guarda la referencia al mediador recibida por parámetro.
        this.mediator = mediator;

        // Inicializa el texto en vacío.
        this.texto = "";
    }

    // Método para simular que se escribe en la caja de contraseña.
    public void escribir(String texto) {

        // Guarda el nuevo texto
        this.texto = texto;

        System.out.println("Contraseña escrita: " + texto);

        // Le avisa al mediador que hubo un cambio.
        mediator.verificar();
    }

    // Método getter para devolver la contraseña actual de la caja.
    public String getTexto() {
        return texto;
    }
}
