import java.util.List;

public class SpecialPizzaOrder extends PizzaOrder {

    private boolean filledBorder;

    public SpecialPizzaOrder(String size, String dough, List<String> ingredients, boolean filledBorder) {
        super(size, dough, ingredients);
        this.filledBorder = filledBorder;
    }

    public SpecialPizzaOrder(SpecialPizzaOrder prototype) {
        super(prototype);
        this.filledBorder = filledBorder;
    }

    @Override
    public SpecialPizzaOrder clonar() {
        return new SpecialPizzaOrder(this);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nBorde Relleno = " + filledBorder;
    }
}
