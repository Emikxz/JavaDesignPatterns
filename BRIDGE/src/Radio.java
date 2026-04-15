public class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 5;

    // Sobreescribimos los métodos.

    @Override
    public void prender() {
        encendido = true;
        System.out.println("Radio Prendida");
    }


    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Radio apagada.");
    }

    @Override
    public boolean isOn() {
    return encendido;
    }

    @Override
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
        }

        System.out.println("Radio volumen actual: " + volumen);
    }

    @Override
    public void subirVolumen() {
        volumen++;
        System.out.println("Radio volumen actual: " + volumen);
    }

    @Override
    public int getVolumen() {
        return volumen;
    }
}
