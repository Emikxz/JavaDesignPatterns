public class Partida {
    private int aldeanos;
    private int comida;
    private int madera;
    private int oro;
    private String edad;

    public Partida(int aldeanos, int comida, int madera, int oro, String edad) {
        this.aldeanos = aldeanos;
        this.comida = comida;
        this.madera = madera;
        this.oro = oro;
        this.edad = edad;
    }

    public void mostrarEstado() {
        System.out.println("Aldeanos: " + aldeanos);
        System.out.println("Comida: " + comida);
        System.out.println("Madera: " + madera);
        System.out.println("Oro: " + oro);
        System.out.println("Edad: " + edad);
        System.out.println("----------------------");
    }

    public PartidaMemento guardarPartida() {
        return new PartidaMemento(aldeanos, comida, madera, oro, edad);
    }

    public void restaurarPartida(PartidaMemento memento) {
        this.aldeanos = memento.getAldeanos();
        this.comida = memento.getComida();
        this.madera = memento.getMadera();
        this.oro = memento.getOro();
        this.edad = memento.getEdad();
    }

    public void setAldeanos(int aldeanos) {
        this.aldeanos = aldeanos;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}