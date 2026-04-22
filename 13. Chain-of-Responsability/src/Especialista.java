public class Especialista extends Handler{
    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getNivelComplejidad()==3) {
            System.out.println("Especialista resuelve: "+solicitud.getTipo());
        } else if (siguiente!= null) {
            manejarSolicitud(solicitud);
        }
    }
}
