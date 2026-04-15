public class ControlRemotoAvanzado extends ControlRemoto {
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mute() {
        while (dispositivo.getVolumen() > 0) {
            dispositivo.bajarVolumen();
        }

        System.out.println("Dispositivo muteado.");
    }
}
