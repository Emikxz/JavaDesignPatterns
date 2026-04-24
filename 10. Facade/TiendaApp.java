//main
public class TiendaApp {
    public static void main(String[] args) {
        // Creamos la fachada una sola vez
        PedidoFacade sistemaVentas = new PedidoFacade();

        // El programador de la interfaz solo necesita esta línea:
        sistemaVentas.RealizarPedido("Laptop Gamer", "Tarjeta de Crédito", 1500.00, "Calle Principal 123");
    }
}