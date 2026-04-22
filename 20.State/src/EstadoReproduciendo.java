// ESTADO CONCRETO B: Cuando el video ya se esta Reproduciendo
public class EstadoReproduciendo implements EstadoReproductor {
    
    // Implementamos qué pasa si toco el boton mientras veo el video
    @Override
    public void presionarBoton(Reproductor reproductor) {
        // Al tocar el boton la accion es frenar el video
        System.out.println("[PAUSA] Video pausado.");
        // Automaticamente le cambiamos el estado interno al Reproductor a Pausado
        reproductor.setEstado(new EstadoPausado()); 
    }
}