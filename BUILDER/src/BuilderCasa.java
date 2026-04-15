// Builder general
public interface BuilderCasa {

    void reiniciar();
    void construirEstructura(String estructura);
    void construirPisos(int cantidad);
    void construirPileta(boolean incluir);
    void construirGarage(boolean incluir);
    void construirJardin(boolean incluir);
    void agregarExtra(String extra);

}
