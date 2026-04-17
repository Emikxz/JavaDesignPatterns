package Bridge;

public class PayPal implements PasarelaDePago {
    @Override
    public void procesarPago(double monto, String concepto) {
        System.out.println("Procesando pago de " + monto + " para " + concepto + " a través de PayPal.");
    }

}
