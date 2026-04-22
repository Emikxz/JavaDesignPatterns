// EL INVOCADOR: El control remoto de la casa
public class ControlRemoto {
    
    // El control tiene una ranura donde le podemos programar cualquier comando
    private Comando botonConfigurado; 

    // Metodo para asignar una orden al boton del control remoto
    public void setComando(Comando comando) {
        this.botonConfigurado = comando; 
    }

    // Metodo que simula que el usuario apretó el boton
    public void presionarBoton() {
        // Ejecuta la orden que tenga configurada, sin importar si es prender o apagar
        botonConfigurado.ejecutar(); 
    }
}