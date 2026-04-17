// 5. MantenimientoVisitor.java (Visitor Concreto)
// Aquí es donde reside la lógica de la operación que queremos agregar.

/**
 * Implementación concreta del visitante que realiza tareas de mantenimiento.
 */
public class MantenimientoVisitor implements Visitor {

    @Override
    public void visit(Motor motor) {
        System.out.println("Mantenimiento de Motor: " + motor.revisarAceite());
    }

    @Override
    public void visit(Carroceria carroceria) {
        System.out.println("Mantenimiento de Carrocería: " + carroceria.lavar());
    }
}