import java.util.*;

abstract public class Warehouse<T> implements Storable<T> {

    Map<String, T> items;

    public Map<String, T> getItems() {
        return items;
    }

    public void setItems(Map<String, T> items) {
        this.items = items;
    }

    public Warehouse() {
        setItems(new HashMap<String, T>());
    }

    @Override
    public void addToInventory(String name, T value) {
        items.put(name, value);
    }

    @Override
    public T getFromInventory(String name) {
        return getItems().get(name);
    }
}