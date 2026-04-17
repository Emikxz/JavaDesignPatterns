// 3. Motor.java (Elemento Concreto)

/**
 * Elemento concreto: Motor.
 */
public class Motor implements Element {
    
    @Override
    public void accept(Visitor visitor) {
        // El elemento "acepta" al visitante y le indica qué método de visita ejecutar (Double Dispatch).
        visitor.visit(this);
    }

    public String revisarAceite() {
        return "Nivel de aceite óptimo.";
    }
}