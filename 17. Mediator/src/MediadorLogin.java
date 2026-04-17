// Clase MediadorLogin
// Es la clase más importante del patrón porque es el mediador concreto.
// Conoce a:
// - CajaUsuario
// - CajaPassword
// - BotonLogIn
// y se encarga de coordinarlos.

public class MediadorLogin implements Mediator {

    // Guarda la referencia a la caja de usuario.
    private CajaUsuario cajaUsuario;

    // Guarda la referencia a la caja de password.
    private CajaPassword cajaPassword;

    // Guarda la referencia al botón de login.
    private BotonLogIn botonLogIn;

    // Método para asignar la caja de usuario al mediador.
    public void setCajaUsuario(CajaUsuario cajaUsuario) {
        // Guarda la referencia recibida.
        this.cajaUsuario = cajaUsuario;
    }

    // Método para asignar la caja de password al mediador.
    public void setCajaPassword(CajaPassword cajaPassword) {
        // Guarda la referencia recibida.
        this.cajaPassword = cajaPassword;
    }

    // Método para asignar el botón al mediador.
    public void setBotonLogIn(BotonLogIn botonLogIn) {
        // Guarda la referencia recibida.
        this.botonLogIn = botonLogIn;
    }

    // Implementación del método que definimos en la interfaz Mediator.
    @Override
    public void verificar() {

        // Consulta si la caja de usuario NO está vacía.
        boolean usuarioCompleto = !cajaUsuario.getTexto().isEmpty();

        // Consulta si la caja de password NO está vacía.
        boolean passwordCompleta = !cajaPassword.getTexto().isEmpty();

        // Si ambas cajas tienen texto
        if (usuarioCompleto && passwordCompleta) {
            //Habilito el botón de login.
            botonLogIn.setHabilitado(true);
        } else {
            // Si falta alguno de los dos campos, deshabilito el botón.
            botonLogIn.setHabilitado(false);
        }
    }
}
