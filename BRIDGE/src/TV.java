// Definimos una clase TV que implementa la interfaz Dispositivo
class TV implements Dispositivo {
    private boolean encendido = false;

    private int volumen = 10;

    //================================================================
    // Sobreescribimos los métodos de la interfaz.
    @Override
    public void prender() {
        // Cambia el estado a prendido.
        encendido = true;

        System.out.println("TV Prendida");
    }

    @Override
    public void apagar() {
        // Cambia el estado a apagado.
        encendido = false;

        System.out.println("TV Apagada");
    }

    @Override
    public boolean isOn() {
        return encendido;
    }

    @Override
    public void subirVolumen() {
        volumen++;

        System.out.println("TV Volumen actual: " + volumen);
    }

    @Override
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
        }

        System.out.println("TV Volumen actual: " + volumen);
    }

    @Override
    public int getVolumen() {
        return volumen;
    }
    //================================================================
}
