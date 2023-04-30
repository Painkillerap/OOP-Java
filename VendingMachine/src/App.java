
import Product.Product;
import VendingMachina.VendingMachina;
import Product.BottleOfWater;
import Product.HotDrink;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("Cola", 88.0);
        item1.setPrice(98.0);
        // Добавляем продукты
        VendingMachina item2 = new VendingMachina(300);
        item2.addProduct(item1);
        item2.addProduct(new Product("Чипсы", 60.0));
        item2.addProduct(new Product("Хлеб", 50.0));
        item2.addProduct(new Product("Снек", 70.0));
        item2.addProduct(new Product("Кофе", 90.0));
        item2.addProduct(new BottleOfWater("Вода питьевая", 100.0, 1000));
        item2.addProduct(new BottleOfWater("Вода минеральная", 160.0, 1500));

        // добавляем горячий напиток
        item2.addProduct(new HotDrink("Кофе", 200.0, 80));
        item2.addProduct(new HotDrink("Чай", 80.0, 90));
        item2.addProduct(new HotDrink("Горячий Шоколад", 130.0, 85));
        // Вывод на печать всех продуктов
        for (Product prod : item2.getProdAll()) {
            System.out.println(prod.toString());
        }
        new MainFrame(item2);
    }
}
