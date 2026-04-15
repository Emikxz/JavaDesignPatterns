import java.util.ArrayList;
import java.util.List;

// 2. El prototipo concreto
public class PizzaOrder implements Prototype<PizzaOrder> {

    private String size;
    private String dough;
    private List<String> ingredients;

    // Constructor normal de nuestro prototipo pizza (crear desde 0 la pizza)
    public PizzaOrder(String size, String dough, List<String> ingredients) {
        this.size = size;
        this.dough = dough;
        this.ingredients = new ArrayList<>(ingredients); // Mutable
    }

    // Constructor copia (para prototype)
    public PizzaOrder(PizzaOrder prototype) {
        this.size = prototype.size;
        this.dough = prototype.dough;
        this.ingredients = new ArrayList<>(prototype.ingredients);
    }

    @Override
    public PizzaOrder clonar() {
        return new PizzaOrder(this);
    }

    // Un método para agregar los ingredientes.
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return  "\nSize =" + size  +
                "\nDough =" + dough +
                "\nIngredients = " + ingredients;
    }
}
