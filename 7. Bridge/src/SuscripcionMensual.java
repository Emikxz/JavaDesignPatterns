package Bridge;

public class SuscripcionMensual extends PlanDeCobro {
    public SuscripcionMensual(PasarelaDePago pasarela) {
        super(pasarela);
    }

    @Override
    public void cobrar(double monto, String concepto) {
        System.out.println("Cobro mensual para " + concepto);
        pasarela.procesarPago(monto, concepto);
    }

}
