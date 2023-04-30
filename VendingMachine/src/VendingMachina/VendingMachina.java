package VendingMachina;

import Product.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachina {
    private int volume;
    private List<Product> products;// = new ArrayList<Product>(); можно объявить сразу
    private List<String> workLog;// = new ArrayList<String>();
    private Double money;
      /**
     * Конструктор с новым параметром
     * @param volume объем бутылки
     */
    public VendingMachina(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();// все продукты
        workLog = new ArrayList<String>();
    }
 // добавить продукт
    public void addProduct(Product prod) {
        products.add(prod);
    }
// запись о продаже
    public void addSales(String line) {
        workLog.add(line);
    }
 // метод выдачи продукта
    public Product getProdByName(String name) {// принимает строку с названием продукта
        for (Product prod : products) {// перебираем все продукты (где ищем: что ищем)
            if (prod.getName().contains(name)) {// если нашёл true
                return prod;// возвращаем продукт
            }
        }
        return null;// не нашёл
    }
 // выдаём все продукты
    public List<Product> getProdAll() {
        return products;
    }
    public String FinalFrame(Product product, Double money) {
        if (money >= product.getPrice()) {
            Double change = money - product.getPrice();
            money = 0.0;
            return "Вы успешно купили " + product.getName() + ". Ваша сдача: " + change + " руб.";
        } else {
            return "У вас недостаточно денег для покупки.";
        }
    }
}