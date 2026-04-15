// Cuando en una interfaz hacemos <T>, hacemos referencia a que la interfaz es genérica, es decir,
// que la interfaz no trabaja con un tipo concreto de dato, sino que el tipo real se va a tener en cuenta
// cuando se implemente la interfaz en sí. O sea, la clase que lo implemente va a establecer qué tipo va a ser.

// 1. Creación del prototipo.
public interface Prototype<T> {

    // T significa Type, que hace referencia por convención a algo en particular (colecciones u otras cosas)
    T clonar();

}
