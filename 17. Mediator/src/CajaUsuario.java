// La clase CajaUsuario representa la caja donde el usuario escribe su nombre.
// No conoce al botón ni a la caja de contraseña, solo al mediator.

public class CajaUsuario {

    // Variable privada para guardar el texto que el usuario escriba.
    private String texto;

    // Variable privada para guardar la referencia al mediator.
    private Mediator mediator;

    // Constructor
    public CajaUsuario(Mediator mediator) {

        // Guardamos la referencia al mediator reciba por parámetro.
        this.mediator = mediator;

        // Inicializamos el texto en vacío.
        this.texto = "";
    }

    // Método para simular que el usuario escribe en la caja.
    public void escribir(String texto) {

        // Guardamos el texto
        this.texto = texto;

        // Mostramos por pantalla lo que escribió.
        System.out.println("El usuario escribió: " + texto);

        // Le avisa al mediador que hubo un cambio.
        mediator.verificar();
    }

    // Método getter para devolver el texto actual de la caja.
    public String getTexto(){
        return texto;
    }
}
