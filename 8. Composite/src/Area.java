import java.util.ArrayList;
import java.util.List;

public class Area implements RecursoHospitalario{
    private String nombre;
    private List<RecursoHospitalario> elementosArea = new ArrayList<>();

    public Area(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(RecursoHospitalario recurso) {
        elementosArea.add(recurso);
    }

    public void mostrarInformacion() {
        System.out.println("area: " + nombre);

        for (RecursoHospitalario r : elementosArea) {
            r.mostrarInformacion();
        }
    }
}
