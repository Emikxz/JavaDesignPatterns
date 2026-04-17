package Bridge;

public class Main {
    public static void main(String[] args) {
        PasarelaDePago paypal = new PayPal();
        PasarelaDePago mercadoPago = new MercadoPago();

        PlanDeCobro suscripcionMensualPaypal = new SuscripcionMensual(paypal);
        PlanDeCobro suscripcionMensualMercadoPago = new SuscripcionMensual(mercadoPago);

        suscripcionMensualPaypal.cobrar(29.99, "Servicio de streaming");
        suscripcionMensualMercadoPago.cobrar(29.99, "Servicio de streaming");
    }

}
