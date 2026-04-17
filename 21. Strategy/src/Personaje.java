package Strategy;

public class Personaje {
    
    // 1. LA MAGIA: Guardamos una referencia a la interfaz, no a un arma específica.
    // Esto es lo que nos permite ponerle un arco, una espada o un hacha mágica mañana.
    private Atacar estrategiaDeAtaque;

    // 2. El constructor: Al crear el personaje, le damos un arma inicial.
    public Personaje(Atacar estrategiaInicial) {
        this.estrategiaDeAtaque = estrategiaInicial;
    }

    // 3. EL SETTER VITAL (Cambio de Estrategia): 
    // Esto es lo que hace que el patrón Strategy sea tan poderoso. 
    // Permite cambiar el comportamiento "en caliente".
    public void setEstrategiaAtaque(Atacar nuevaEstrategia) {
        this.estrategiaDeAtaque = nuevaEstrategia;
        System.out.println("\n[El personaje ha cambiado de arma]");
    }

    // 4. Delega la ejecución: El personaje no sabe cómo atacar, 
    // le dice al arma equipada que haga su trabajo.
    public void ejecutarAtaque() {
        // Ejecuta el método atacar() del objeto que tenga guardado en ese momento
        this.estrategiaDeAtaque.atacar();
    }
}