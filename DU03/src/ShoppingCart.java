import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getNumber();
        }
        return total;
    }

    public double getTotalPriceWithDiscount(double discount) {
        return getTotalPrice() * (1 - discount / 100);
    }


    
    public void add(Item item) {
        items.add(item);
    }


    public List<String> getItemNames() {
        List<String> names = new ArrayList<>();
        for (Item item : items) {
            if (!names.contains(item.getName())) {
                names.add(item.getName());
            }
        }
        return names;
    }

}
