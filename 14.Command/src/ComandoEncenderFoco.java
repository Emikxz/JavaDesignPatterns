// COMANDO CONCRETO A: El objeto que encapsula la orden de PRENDER
public class ComandoEncenderFoco implements Comando {
    
    // Necesitamos saber qué foco vamos a prender.
    private FocoInteligente foco; 

    // Constructor: Al crear el comando le decimos que foco controlar
    public ComandoEncenderFoco(FocoInteligente foco) {
        this.foco = foco; 
    }

    // Al ejecutarse el comando usamos el foco para prenderlo
    @Override
    public void ejecutar() {
        foco.encender(); 
    }
}