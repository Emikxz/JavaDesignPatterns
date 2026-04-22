public class Solicitud {
    private String tipo;
    private int nivelComplejidad;

    public Solicitud(String tipo, int nivelComplejidad) {
        this.nivelComplejidad = nivelComplejidad;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivelComplejidad() {
        return nivelComplejidad;
    }
}
