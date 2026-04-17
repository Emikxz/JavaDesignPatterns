// 4. Carroceria.java (Elemento Concreto)

/**
 * Elemento concreto: Carrocería.
 */
public class Carroceria implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String lavar() {
        return "Lavado con cera completado.";
    }
}