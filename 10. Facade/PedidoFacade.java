public class PedidoFacade { 
    private Almacen almacen;
    private Pagos pagos;
    private Envio envio;

    //constructor
    public PedidoFacade() {
        this.almacen = new Almacen();
        this.pagos = new Pagos();
        this.envio = new Envio();
    }

    public void RealizarPedido(String producto, String metodoPago, double monto, String direccion) {
        if (almacen.HayStock(producto)) {
            almacen.Reservar(producto);
            if (pagos.ProcesarPago(metodoPago, monto)) {
                envio.EnviarProducto(producto, direccion);
                System.out.println("Pedido realizado con éxito.");
            } else {
                System.out.println("Error en el pago.");
            }
        } else {
            System.out.println("Producto sin stock.");
        }
    }
}