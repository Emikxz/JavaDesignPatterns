// INTERFAZ SUJETO
// Esta interfaz define las operaciones básicas para administrar observadores.
public interface Sujeto {

    // Agregar un observer a la lista.
    void addObserver(Observer o);

    // Eliminar un observer de la lista.
    void delObserver(Observer o);

    // Notifica a todos los observers registrados.
    void notifyObservers();
}
