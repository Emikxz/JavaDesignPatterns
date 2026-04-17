package src;
import java.util.Objects;

// 1. Forma.java (Prototipo Base)
// Define los atributos comunes (coordenadas y color) y el contrato de clonación.

// La clase base que define la interfaz de clonación.
public abstract class Forma {
    public int x;
    public int y;
    public String color;

    // Constructor estándar.
    public Forma() {
    }

    // Constructor de prototipo. 
    // Copia los valores del objeto 'fuente' a la nueva instancia.
    public Forma(Forma fuente) {
        if (fuente != null) {
            this.x = fuente.x;
            this.y = fuente.y;
            this.color = fuente.color;
        }
    }

    // Método abstracto que debe ser sobrescrito por las subclases.
    public abstract Forma clonar();

    @Override
    public boolean equals(Object objeto2) {
        if (!(objeto2 instanceof Forma)) return false;
        Forma forma2 = (Forma) objeto2;
        return forma2.x == x && forma2.y == y && Objects.equals(forma2.color, color);
    }
}