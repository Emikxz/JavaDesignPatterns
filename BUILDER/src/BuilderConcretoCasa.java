import java.util.ArrayList;
import java.util.List;

// Paso 3, builder concreto.
public class BuilderConcretoCasa implements BuilderCasa {

    private Casa resultado;
    private List<String> extras = new ArrayList<>();

    @Override
    public void reiniciar() {
        this.resultado = new Casa();
        this.extras = new ArrayList<>();
    }

    @Override
    public void construirEstructura(String tipoEstructura) {
        resultado.setTipoEstructura(tipoEstructura);
    }

    @Override
    public void construirPisos(int cantidad) {
        resultado.setPisos(cantidad);
    }

    @Override
    public void construirPileta(boolean incluir) {
        resultado.setPileta(incluir);
    }

    @Override
    public void construirGarage(boolean incluir) {
        resultado.setGarage(incluir);
    }

    @Override
    public void construirJardin(boolean incluir) {
        resultado.setJardin(incluir);
    }

    @Override
    public void agregarExtra(String extra) {
        this.extras.add(extra);
        resultado.setExtras(extras);
    }

    // Método típico de un builder concreto, la devolución del objeto construido.
    public Casa obtenerResultado() {
        return resultado;
    }
}
