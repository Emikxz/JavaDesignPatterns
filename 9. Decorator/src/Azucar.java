package src;

// Azucar.java (Decorador Concreto)
// Siguiendo la misma lógica que con la leche, extendemos de AgregadoDecorator.

public class Azucar extends AgregadoDecorator {
    
    public Azucar(Bebida bebida) {
        // Pasamos la bebida al constructor de la clase padre (AgregadoDecorator)
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        // Concatenamos "con Azúcar" a lo que ya traía la bebida
        return bebidaDecorada.getDescripcion() + ", con Azúcar";
    }

    @Override
    public double cost() {
        // Sumamos 0.2 al costo acumulado de la bebida
        return bebidaDecorada.cost() + 0.2;
    }
}