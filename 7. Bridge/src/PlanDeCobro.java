package Bridge;

public abstract class PlanDeCobro {
    protected PasarelaDePago pasarela;

    public PlanDeCobro(PasarelaDePago pasarela) {
        this.pasarela = pasarela;
    }
    public abstract void cobrar(double monto, String concepto);

}
