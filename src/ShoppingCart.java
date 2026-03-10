import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, Double> items;

    public ShoppingCart() {
        items = new LinkedHashMap<>();
    }

    public void addItem(String name, double price) {
        items.put(name, price);
    }

    public void removeItem(String name) {
        items.remove(name);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}

