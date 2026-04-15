public abstract class EnvioCreator {

    // Factory Method
    protected abstract Envio crearEnvio();

    // Lógica en común que van a tener todos los tipos de envíos
    public void procesarEnvio() {
        Envio envio = crearEnvio(); // Llamar a nuestro factory method.
        envio.sendPackage();
    }
}
