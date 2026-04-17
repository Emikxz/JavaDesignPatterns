// CLASE PRODUCTO
// Esta clase es el SUJETO CONCRETO.
// Tiene un estado (nombre y precio) y cuando cambia el precio, notifica a los observadores.
public class Producto implements Sujeto {

    // Nombre del producto
    private String name;

    // Precio del producto
    private double price;

    // Arreglo dinámico que almacena los observers.
    private java.util.ArrayList<Observer> observers;

    // Constructor del producto
    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new java.util.ArrayList<>();
    }

    // Implementación del método para agregar observadores de la interfaz Sujeto.
    @Override
    public void addObserver(Observer o) {
        // Agrega el observer a la lista.
        observers.add(o);
    }

    // Implementación del método para eliminar observadores de la interfaz Sujeto.
    @Override
    public void delObserver(Observer o) {
        // Quita el observer de la lista.
        observers.remove(o);
    }

    // Implementación del método para notificar a los observadores de la interfaz Sujeto.
    @Override
    public void notifyObservers(){

        // Recorre cada observer de la lista.
        for (Observer o: observers) {

            // Llama al método actualizar de cada observador.
            o.update(name, price);
        }
    }

    // Método para cambiar el precio del producto.
    public void setPrecio(double newPrice) {
        this.price = newPrice;

        System.out.println("El precio de " + name + " cambió a $" + price);

        // Como hubo un cambio importante, se notifica a todos.
        notifyObservers();
    }

    // Getter del nombre
    public String getName() {
        return name;
    }

    // Getter del precio
    public double getPrice() {
        return price;
    }
}
