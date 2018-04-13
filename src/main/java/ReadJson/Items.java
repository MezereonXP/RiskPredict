package ReadJson;

import java.util.List;

/**
 *
 */

public class Items {
    public List<Item> items;

    public Items(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
