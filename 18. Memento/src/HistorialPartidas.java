import java.util.ArrayList;
import java.util.List;

public class HistorialPartidas {
    private List<PartidaMemento> partidasGuardadas = new ArrayList<>();

    public void agregarGuardado(PartidaMemento memento) {
        partidasGuardadas.add(memento);
    }

    public PartidaMemento obtenerGuardado(int indice) {
        return partidasGuardadas.get(indice);
    }
}