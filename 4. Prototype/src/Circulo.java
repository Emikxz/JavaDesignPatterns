package src;

// 2. Circulo.java (Prototipo Concreto)
// Añade el atributo radio y su propia lógica de copia.

public class Circulo extends Forma {
    public int radio;

    public Circulo() {
    }

    // Constructor de copia específico para Círculo.
    public Circulo(Circulo fuente) {
        // Llama al constructor de la clase padre para copiar x, y, color.
        super(fuente);
        if (fuente != null) {
            this.radio = fuente.radio;
        }
    }

    @Override
    public Forma clonar() {
        // Crea una copia exacta de sí mismo.
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object objeto2) {
        if (!(objeto2 instanceof Circulo) || !super.equals(objeto2)) return false;
        Circulo forma2 = (Circulo) objeto2;
        return forma2.radio == radio;
    }
}