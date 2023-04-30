package Product;

public class HotDrink extends Product {
// температура
    private int temperature;
// Конструктор класса
   public HotDrink(String name, double price, int temperature) {
        super(name, price);// конструктор родительского класса
        this.temperature = temperature;// доп. поле температура
}
    // возвращает температуру напитка
    public int getTemperature() {
        return temperature;
    }
 // Переопределяем метод toString()
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +" rub"+
                ", temperature=" + temperature +"`c" +
                '}';
    }

}
