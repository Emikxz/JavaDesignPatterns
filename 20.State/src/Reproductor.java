// EL CONTEXTO: La aplicacion del Reproductor (ej: YouTube)
public class Reproductor {
    
    // La variable que guarda en que estado actual se encuentra la app
    private EstadoReproductor estadoActual; 

    // Constructor: Todo video arranca en estado Pausado por defecto
    public Reproductor() {
        this.estadoActual = new EstadoPausado(); 
    }

    // Metodo para permitir que los estados actualicen al reproductor
    public void setEstado(EstadoReproductor nuevoEstado) {
        this.estadoActual = nuevoEstado; // Guardamos el nuevo estado.
    }

    // Metodo que llama el usuario desde la interfaz grafica al hacer click
    public void clickEnPlayPause() {
        // El reproductor no tiene "ifs" simplemente le dice a su estado actual que actue
        estadoActual.presionarBoton(this); 
    }
}