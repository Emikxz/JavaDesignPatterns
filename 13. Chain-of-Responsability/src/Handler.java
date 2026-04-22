public abstract class Handler {
    protected Handler siguiente;

    public void setSiguiente (Handler siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarSolicitud(Solicitud solicitud);

    
}

/*A diferencia de otroas patrones que usan interfaz, que sirve si solo querés definir contrato, en cambio la clase abstracta
sirve mejor si querés compartir estado y lógica base */
