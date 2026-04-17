package src;

// 3. Rectangulo.java (Prototipo Concreto)
// Añade ancho y alto.

public class Rectangulo extends Forma {
    public int ancho;
    public int alto;

    public Rectangulo() {
    }

    public Rectangulo(Rectangulo fuente) {
        super(fuente);
        if (fuente != null) {
            this.ancho = fuente.ancho;
            this.alto = fuente.alto;
        }
    }

    @Override
    public Forma clonar() {
        return new Rectangulo(this);
    }

    @Override
    public boolean equals(Object objeto2) {
        if (!(objeto2 instanceof Rectangulo) || !super.equals(objeto2)) return false;
        Rectangulo forma2 = (Rectangulo) objeto2;
        return forma2.ancho == ancho && forma2.alto == alto;
    }
}