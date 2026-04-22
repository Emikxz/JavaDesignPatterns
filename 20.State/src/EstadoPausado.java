// ESTADO CONCRETO A: Cuando el video esta en Pausa
public class EstadoPausado implements EstadoReproductor {
    
    // Implementamos que pasa si toco el boton estando en pausa
    @Override
    public void presionarBoton(Reproductor reproductor) {
        // Al tocar el boton la accion es empezar a reproducir
        System.out.println("[PLAY] Empezando a reproducir el video...");
        // Automaticamente le cambiamos el estado interno al Reproductor
        reproductor.setEstado(new EstadoReproduciendo()); 
    }
}