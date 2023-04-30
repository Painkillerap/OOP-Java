package Product;

public class BottleOfWater extends Product {

    private int volume;

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    // возвращает объём бутылки
    public int getVolume() {
        return volume;
    }

    // устанавливает объём бутылки
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // переопределение вывода продукта
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +" rub"+
                ", volume=" + volume + "L" +
                '}';
    }

}
