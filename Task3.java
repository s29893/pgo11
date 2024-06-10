import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

        items.add(new Item(6, "Camera"));
        items.add(new Item(7, "Printer"));
        items.add(new Item(8, "Monitor"));
        items.add(new Item(9, "Keyboard"));
        items.add(new Item(10, "Mouse"));
        items.add(new Item(11, "Speaker"));
        items.add(new Item(12, "Router"));
        items.add(new Item(13, "Modem"));
        items.add(new Item(14, "Microphone"));
        items.add(new Item(15, "Webcam"));


        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }


   
        List<Item> subList = items.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println("HashSet contains: " + item);
        }
    }
}
