public class Administrador {
    private static Administrador instancia;

    private String nombre;

    /*Declaro un constructor vacio porque necesito poder pedir la única instancia sin tener antes un objeto creado, para ello hago uso de un 
    metodo estatico*/
    private Administrador() {
    }

    public static Administrador getInstancia() {
        if (instancia == null) {
            instancia = new Administrador();
        }
        return instancia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/*
Entonces, el método estático cumple dos funciones
1. Permite acceder sin instancia previa:
Podés invocarlo directamente desde la clase.

2. Centraliza el control de creación
La clase decide si:
-crea el objeto por primera vez
-o devuelve el mismo de siempre
*/
