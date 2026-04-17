public class Main {
   public static void main(String[] args) {
        // Construir una computadora para juegos
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        // Construir la computadora utilizando el director, y que nos de el paso a paso
        ComputerDirector director = new ComputerDirector();
        // El director se encarga de construir la computadora utilizando el builder específico para juegos
        director.construct(gamingBuilder);
        // Obtener la computadora construida por el builder de juegos
        Computadora gamingComputer = gamingBuilder.getResults();

        gamingComputer.showSpecs();
    }

}
