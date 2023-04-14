import Product.Product;
import VendingMachina.VendingMachina;
import Product.BottleOfWater;
public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("Cola", 88.0);
        item1.setPrice(98.0);

        VendingMachina item2 = new VendingMachina(300);
        item2.addProduct(item1);
        item2.addProduct(new Product("Чипсы", 60.0));
        item2.addProduct(new Product("Хлеб", 50.0));
        item2.addProduct(new Product("Снек", 70.0));
        item2.addProduct(new Product("Кофе", 90.0));
        item2.addProduct(new BottleOfWater("Water", 100.0,1000));
        item2.addProduct(new BottleOfWater("Water", 160.0,1500));

        for (Product prod : item2.getProdAll()) {
            System.out.println(prod.toString());
        }
    }
}
