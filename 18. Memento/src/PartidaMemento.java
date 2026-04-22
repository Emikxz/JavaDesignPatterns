import java.time.LocalDateTime;

public class PartidaMemento {
    private final LocalDateTime fecha;
    private final int aldeanos;
    private final int comida;
    private final int madera;
    private final int oro;
    private final String edad;

    public PartidaMemento(int aldeanos, int comida, int madera, int oro, String edad) {
        this.fecha = LocalDateTime.now();
        this.aldeanos = aldeanos;
        this.comida = comida;
        this.madera = madera;
        this.oro = oro;
        this.edad = edad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getAldeanos() {
        return aldeanos;
    }

    public int getComida() {
        return comida;
    }

    public int getMadera() {
        return madera;
    }

    public int getOro() {
        return oro;
    }

    public String getEdad() {
        return edad;
    }
}