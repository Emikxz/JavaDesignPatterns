public class App {
    public static void main(String[] args) {
        //llamo al metodo estatico sobre la clase, no sobre un objeto.
        Administrador carlos = Administrador.getInstancia();
        Administrador jose = Administrador.getInstancia();

        carlos.setNombre("carlos");

        System.out.println(carlos.getNombre());
        System.out.println(jose.getNombre());
    }
}


