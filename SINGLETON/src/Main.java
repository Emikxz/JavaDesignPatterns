public class Main {
    public static void main(String[] args) {

        // 1er Módulo
        System.out.println("\nMódulo de Autenticación.");
        // ConfigurationSINGLETON config1 = new Configuracion()
        // Esto no me lo va a dejar hacer porque el constructor es privado y solo la propia clase puede crear nuevas instancias.
        ConfigurationSINGLETON config1 = ConfigurationSINGLETON.getInstance();
        config1.showMsg();

        // 2do Módulo
        System.out.println("\nMódulo de Reportes");
        ConfigurationSINGLETON config2 = ConfigurationSINGLETON.getInstance();
        config2.showMsg();

        // Comprobación
        System.out.println("\n¿Ambas referencias son iguales?");
        System.out.println(config1 == config2);
    }
}
