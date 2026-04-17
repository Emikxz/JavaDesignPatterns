// CLASE BotonLogIn
// Clase que representa el botón de login.
// El botón no decide por sí solo si se habilita.
// El mediador se encarga de eso.

public class BotonLogIn {

    // Variable para guardar el estado de si está o no habilitado.
    private boolean habilitado;

    // Constructor
    public BotonLogIn() {
        // Empieza en false
        this.habilitado = false;
    }

    // Método para cambiar el estado del botón.
    public void setHabilitado(boolean habilitado) {

        // Guarda el nuevo estado
        this.habilitado = habilitado;

        // Si el botón quedó habilitado.
        if (habilitado) {
            System.out.println("Botón LogIn Habilitado.");
        } else {
            System.out.println("Botón LogIn deshabilitado.");
        }
    }

    // Método para consultar si el botón está habilitado.
    public boolean isHabilitado() {
        return habilitado;
    }

    // Método para simular que se clickea el botón.
    public void click() {

        // Si el botón está habilitado
        if (habilitado) {
            System.out.println("Usuario logueado.");
        } else {
            System.out.println("No se puede loguear, botón deshabilitado");
        }
    }
}


