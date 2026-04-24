public abstract class ClasePersonaje {
    
public abstract InterfazPersonaje UsarPersonaje();

public void mostrarPersonaje() {
    InterfazPersonaje personaje = UsarPersonaje();
    personaje.presentacion();
    personaje.mostrarHabilidad();
}

}
