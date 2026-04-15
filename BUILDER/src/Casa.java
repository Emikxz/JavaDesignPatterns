import java.util.ArrayList;
import java.util.List;

// Objeto a construir
public class Casa {

    private String tipoEstructura;
    private int pisos;
    private boolean pileta;
    private boolean garage;
    private boolean jardin;
    private List<String> extras = new ArrayList<>();

    // Setters [para que el builder pueda armar la casa paso a paso]
    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setPileta(boolean pileta) {
        this.pileta = pileta;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() { // Para mostrar los datos de la casa.
        return  "Tipo de Estructura = " + tipoEstructura +
                "\nPisos = " + pisos +
                "\nPileta = " + pileta +
                "\nGarage = " + garage +
                "\nJardin = " + jardin +
                "\nExtras = " + extras ;
    }

}
