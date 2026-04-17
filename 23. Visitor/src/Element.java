// 2. Element.java (Interfaz)
// Define cómo los elementos reciben visitas.

/**
 * Interfaz que deben implementar todos los componentes
 * que deseen ser "visitados".
 */
public interface Element {
    void accept(Visitor visitor);
}