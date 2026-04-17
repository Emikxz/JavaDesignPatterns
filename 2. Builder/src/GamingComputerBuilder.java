public class GamingComputerBuilder implements Builder {
    private Computadora computadora = new Computadora();

    public void buildCpu() {
        computadora.setCpu("Intel Core i9");
    }
    public void buildRam() {
        computadora.setRam("32GB DDR4");
    }
    public void buildStorage() {
        computadora.setStorage("1TB SSD");
    }
    public Computadora getResults() {
        return computadora;
    }
}
