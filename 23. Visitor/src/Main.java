// 6. Main.java (Clase de Prueba)

public class Main {
    public static void main(String[] args) {
        // 1. Creamos los elementos
        Element motor = new Motor();
        Element carroceria = new Carroceria();

        // 2. Creamos el visitante con la lógica deseada
        Visitor mantenimiento = new MantenimientoVisitor();

        // 3. Ejecutamos la operación sin modificar las clases de los elementos
        System.out.println("Iniciando revisión del vehículo:");
        motor.accept(mantenimiento);
        carroceria.accept(mantenimiento);
    }
}