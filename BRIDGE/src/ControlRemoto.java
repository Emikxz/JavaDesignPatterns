public class ControlRemoto {
    // Guarda la referencia a un objeto que implementa Dispositivo.
    protected Dispositivo dispositivo;

    // Constructor de la casa control remoto.
    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void togglePower() {
        if (dispositivo.isOn()) {
            dispositivo.apagar();
        } else {
            dispositivo.prender();
        }
    }

    public void volumenArriba() {
        dispositivo.subirVolumen();
    }

    public void volumenAbajo() {
        dispositivo.bajarVolumen();
    }
}
