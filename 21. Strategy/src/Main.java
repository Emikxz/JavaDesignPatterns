package Strategy;

public class Main {
    public static void main(String[] args) {
        
        // 1. Creamos las estrategias (Nuestras armas)
        Atacar espada = new AtacarEspada();
        Atacar arco = new AtacarArco();

        // 2. Creamos nuestro personaje y le damos la espada inicial
        System.out.println("--- Inicia el combate ---");
        Personaje guerrero = new Personaje(espada);

        // 3. El personaje ataca (Usará la lógica de AtacarEspada)
        guerrero.ejecutarAtaque();

        // 4. ¡El enemigo está lejos! Cambiamos la estrategia dinámicamente
        guerrero.setEstrategiaAtaque(arco);

        // 5. El personaje vuelve a atacar (Ahora usará la lógica de AtacarArco)
        guerrero.ejecutarAtaque();
    }
}