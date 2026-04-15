/*
* PATRON ESTRUCTURAL BRIDGE
* Sirve para separar una abstracción de su implementación, de manera que las dos puedan cambiar por separado.
* Si no se usa bridge, se podría terminar creando muchas clases.
* En vez de unir todo en una jerarquía, lo que hace bridge es:
*                 - Una jerarquía para la abstracción
*                 - Una jerarquía para la implementación
*                 - Las conecta con una referencia
* El problema que resuelve bridge es evitar la explosión de clases, reducir el acoplamiento y permitir cambiar una
* parte del sistema sin tocar la otra.
* ¿ Cuándo conviene usarlo?
* Cuando se tiene dos ejes de variación, ambos pueden crecer con el tiempo o cuando no se quiere
*  crear una combinación de subclases para cada caso.
* */


// La idea sobre este codigo es la siguiente:
// Dispositivo.interface es la implementación.
// TV.class y Radio.class son implementaciones concretas.
// ControlRemoto.class es la abstracción.
// ControlRemotoAvanzado es una abstracción especializada.

// Lo importante acá es que control remoto no depende de TV ni de Radio, sino de la interfaz Dispositivo. Por eso
// se puede usar el mismo control con distintos dispositivos.

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();

        ControlRemoto controlTV = new ControlRemoto(tv);

        controlTV.togglePower();
        controlTV.volumenArriba();
        controlTV.volumenAbajo();

        System.out.println("\n====================\n");

        Dispositivo radio = new Radio();

        ControlRemotoAvanzado controlRadio = new ControlRemotoAvanzado(radio);

        controlRadio.togglePower();
        controlRadio.volumenAbajo();
        controlRadio.volumenArriba();
        controlRadio.mute();
        controlRadio.togglePower();
    }
}