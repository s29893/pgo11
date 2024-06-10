import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Laptop"));
        items.add(new Item(2, "Smartphone"));
        items.add(new Item(3, "Tablet"));
        items.add(new Item(4, "Headphones"));
        items.add(new Item(5, "Smartwatch"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
