public class ConfigurationSINGLETON {
    // Un SINGLETON está formado por 3 partes:
    // Una clase con constructor privado.
    // Una variable estática.
    // Un método público que sea estático.


    // Variable estática
    private static ConfigurationSINGLETON instancia;

    // Constructor
    private ConfigurationSINGLETON () {
        System.out.println("Inicializando configuración en el sistema!");
    }

    // Un método público que tenga la clase y que sea estático.
    public static ConfigurationSINGLETON getInstance() {

        if (instancia == null) {
            instancia = new ConfigurationSINGLETON();
        }
        return instancia;
    }

    // Opcional, puedo crear un método dentro del SINGLETON.
    public void showMsg() {
        System.out.println("Configuración activa!");
    }
}
