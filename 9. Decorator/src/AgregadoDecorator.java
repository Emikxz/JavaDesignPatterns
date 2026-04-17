package src;

// 3. AgregadoDecorator.java (Decorador Base)
// Es una clase abstracta que "envuelve" a una Bebida.

public abstract class AgregadoDecorator implements Bebida {
    protected Bebida bebidaDecorada; // Referencia al objeto envuelto

    public AgregadoDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }

    public String getDescripcion() {
        return bebidaDecorada.getDescripcion();
    }

    public double cost() {
        return bebidaDecorada.cost();
    }
}