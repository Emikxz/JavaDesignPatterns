package src;

// 2. CafeSimple.java (Componente Concreto)
// Esta es nuestra base, el objeto que recibirá las mejoras.

public class CafeSimple implements Bebida {
    
    @Override
    public String getDescripcion() {
        return "Café Simple";
    }

    @Override
    public double cost() {
        return 2.0; // Precio base
    }
}