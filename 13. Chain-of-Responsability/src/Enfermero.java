public class Enfermero extends Handler{
    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getNivelComplejidad()==1) {
            System.out.println("Enfermero resuelve: "+solicitud.getTipo());
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }
}
