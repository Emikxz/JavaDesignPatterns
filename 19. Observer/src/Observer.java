// INTERFAZ OBSERVER
// Esta interfaz define lo que debe hacer cualquier objeto que quiera ser notificado.

public interface Observer {

    // Método que el sujeto llamará cuando haya cambios.
    void update(String productName, double productNewPrice);
}
