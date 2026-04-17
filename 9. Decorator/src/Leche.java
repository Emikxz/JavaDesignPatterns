package src;

// 4. Leche.java (Decorador Concreto)
// Añade su propia funcionalidad (precio y descripción) a la bebida existente.

public class Leche extends AgregadoDecorator {
    
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        // Añade su descripción a la descripción previa
        return bebidaDecorada.getDescripcion() + ", con Leche";
    }

    @Override
    public double cost() {
        // Suma su costo al costo del objeto envuelto
        return bebidaDecorada.cost() + 0.5;
    }
}