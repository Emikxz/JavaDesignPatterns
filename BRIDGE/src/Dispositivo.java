public interface Dispositivo {

    void prender();
    void apagar();
    boolean isOn();
    void subirVolumen();
    void bajarVolumen();
    int getVolumen();

}
