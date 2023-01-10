package Task5;

import java.util.Objects;

public class Item {
    public static void main(String[] args) {
        Item item1 = new Item(5,5,"One");
        Item item2 = new Item(5,5,"One");
        System.out.println(item1.equals(item2));

    }
    int weight ;
    int cost ;
    String name;

    public Item (){}

    public Item(int weight, int cost, String name) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight && cost == item.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost);
    }
}
