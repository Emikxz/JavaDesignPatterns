public class Medico extends Handler {
    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getNivelComplejidad()==2) {
            System.out.println("Médico resuelve: "+solicitud.getTipo());
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }
}
