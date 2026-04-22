public class Profesional implements RecursoHospitalario{
    private String nombre;
    public enum Especialidad {Generalista , Cardiologo, Traumatologo};
    private Especialidad especialidad;

    public Profesional(String nombre, Especialidad especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarInformacion() {
        System.out.println(especialidad + ": " + nombre);
    }
}
