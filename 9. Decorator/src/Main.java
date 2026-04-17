package src;

// 5. Main.java (Prueba del Patrón)
// Aquí es donde ocurre la "magia" de envolver objetos.

public class Main {
    public static void main(String[] args) {
        // Creamos un café base
        Bebida miPedido = new CafeSimple();
        
        // Lo decoramos con Leche
        miPedido = new Leche(miPedido);
        
        // Lo decoramos con Azúcar
        miPedido = new Azucar(miPedido);
        
        // Resultado final: Café Simple + Leche + Azúcar
        System.out.println("Detalle: " + miPedido.getDescripcion());
        System.out.println("Costo total: $" + miPedido.cost());
        
        // Ejemplo de "Combo Especial": Café con doble azúcar y leche
        Bebida comboDulce = new Azucar(new Azucar(new Leche(new CafeSimple())));
        System.out.println("\nCombo Dulce: " + comboDulce.getDescripcion());
        System.out.println("Costo Combo: $" + comboDulce.cost());
    }
}