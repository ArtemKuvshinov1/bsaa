package Task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Shop implements Basket {
    Map<String, Integer> shop1 = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        shop1.put(product, quantity);
    }
    @Override
    public void removeProduct(String product) {
        for (Map.Entry<String, Integer> o : shop1.entrySet()) {
            if (product.equals(o.getKey())) {
                shop1.remove(o.getKey());
            }
            return;
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Map.Entry<String, Integer> o : shop1.entrySet()) {
            if (product.equals(o.getKey())) {
                shop1.put(product,quantity);
            }
        }
    }

    @Override
    public void clear() {
        shop1.clear();
    }

    @Override
    public List<String> getProducts() {
        for (Map.Entry<String, Integer> o : shop1.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        int b =0;
        for (Map.Entry<String, Integer> o : shop1.entrySet()) {
            if (product.equals(o.getKey())) {
                System.out.println(o.getKey()+ " -getProductQuantity= "+ o.getValue());
            }else b+=1;
        }
        return 0;
    }
}

