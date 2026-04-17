// CLASE CLIENTE
// Esta clase es un OBSERVADOR CONCRETO.
// Cada cliente decide qué hacer cuando recibe la notificación del producto.

public class Cliente implements Observer{

    // Nombre del cliente
    private String clientName;

    // Constructor
    public Cliente(String clientName) {
        this.clientName = clientName;
    }

    // Implementación del método update del Observer.
    @Override
    public void update(String productName, double productNewPrice) {

        // Muestra por pantalla el mensaje recibido.
        System.out.println("Cliente " + clientName + " recibió aviso de que el producto " + productName + " ahora vale $" + productNewPrice);
    }
}
