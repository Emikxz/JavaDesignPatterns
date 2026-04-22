// COMANDO CONCRETO B: El objeto que encapsula la orden de APAGAR
public class ComandoApagarFoco implements Comando {
    
    // Necesitamos saber que foco vamos a apagar
    private FocoInteligente foco; 

    // Constructor: Recibimos el foco a controlar
    public ComandoApagarFoco(FocoInteligente foco) {
        this.foco = foco; 
    }

    // Al ejecutarse usamos el foco para apagarlo
    @Override
    public void ejecutar() {
        foco.apagar(); 
    }
}