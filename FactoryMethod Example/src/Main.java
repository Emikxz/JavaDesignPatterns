public class Main {


    /*
    * ¿Cuándo se usa Factory Method?
    * Cuando no conozcas de antemano las dependencias y los tipos exactos de los objetos con los que va a trabajar el código.
    * Cuando querés permitir en tu código una forma de extender componentes internos de clases.
    * Cuando quieras ahorrar recursos del sistema mediante la reutilización de objetos existentes en lugar de reconstruirlos cada vez.
    */
    public static void main(String[] args) {

        EnvioCreator envioCorreo = new EnvioCorreoCreator();
        envioCorreo.procesarEnvio();

        EnvioCreator envioMoto = new EnvioMotoCreator();
        envioMoto.procesarEnvio();

        EnvioCreator envioCamion = new EnvioCamionCreator();
        envioCamion.procesarEnvio();

    }
}