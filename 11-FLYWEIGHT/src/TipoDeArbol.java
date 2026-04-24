public class TipoDeArbol implements Arbol {
/*modelamos un arbol,donde guardamos los atributos intrinsecos
 */
    String tipoArbol;
    String color;
    String textura;
    //contructor que inicializa los intrinsecos estos no cambian
    public TipoDeArbol(String tipoArbol, String color, String textura) {
        this.tipoArbol = tipoArbol;
        this.color=color;
        this.textura=textura;
    }
    @Override
    // Método que usa datos extrínsecos
    public void dibujar(int x,int y,int tamaño) {
        System.out.println("tipo de arbol: " + tipoArbol + ", color: " + color + ", textura: " + textura
        + ", posicion en x: " +x +", posicion en y: " + y + ", tamaño: " + tamaño);
    }
}
