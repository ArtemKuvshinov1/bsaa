package Task6;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct("Milk",177);
        shop.addProduct("Milk1",179);
        shop.addProduct("Milk2",175);

        System.out.println("Все товары");
        shop.getProducts();
        System.out.println("После удаления");
        shop.removeProduct("Milk1");
        shop.getProducts();

        System.out.println("После обновления");
        shop.updateProductQuantity("Milk2",190);
        shop.getProducts();

        System.out.println("Получение кол-ва");
        shop.getProductQuantity("Milk");
        

    }
}

