// 1. Visitor.java (Interfaz)
// Define qué puede visitar el patrón.

/**
 * Interfaz que define las operaciones de visita para cada 
 * tipo de elemento concreto de la estructura.
 */
public interface Visitor {
    void visit(Motor motor);
    void visit(Carroceria carroceria);
}