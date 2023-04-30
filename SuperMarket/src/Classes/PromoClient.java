package Classes;

/**
 * Класс, описывающий акционного клиента
 */
public class PromoClient extends Actor {

    private String promoName; // Название акции
    private static int promoClientNumber = 0; // Номер клиента в акции
    final int VALUE = 3;// Максимальное кличество участников акции

    /**
     * Конструктор класса акционного клиента
     *
     * @param promoName Название акции
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        promoClientNumber++; // Инкремент номера клиента в акции
        if (promoClientNumber > VALUE) {

            System.out.printf("Отказ клиенту %s: исчерпан лимит акционных покупателей\n", name);
            promoName = "NoMoreAction";
            System.out.println("Name of the current class nameAction: " + getClass().getName() + " " + promoName);
        }
    }

    /**
     * Метод для получения имени клиента.
     * 
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод для получения номера клиента в акции
     * 
     * @return Номер клиента в акции
     */
    public static int getPromoClientNumber() {
        return promoClientNumber;
    }

    /**
     * Метод для изменения названия акции
     * 
     * @param promoName Название акции
     */
    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    /**
     * Метод для получения названия акции
     * 
     * @return Название акции
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Метод максимального количества участников акции
     * 
     * @return
     */
    public int getActionMaxCount() {
        return VALUE;
    }

    /**
     * Общие методы для всех клиентов
     */
    /**
     * Метод для установки флага о желании клиента сделать заказ.
     * 
     * @param makeOrder значение флага
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Метод для установки флага о готовности клиента забрать заказ.
     * 
     * @param pickUpOrder значение флага
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    /**
     * Метод для проверки, хочет ли клиент сделать заказ.
     * 
     * @return true, если клиент хочет сделать заказ, иначе false
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод для проверки, готов ли клиент забрать заказ.
     * 
     * @return true, если клиент готов забрать заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод для получения объекта клиента.
     * 
     * @return объект клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Метод для проверки возможности возврата товара.
     * 
     * @return true - если возврат возможен, false - если нет.
     */
    @Override
    public boolean getReasonForReturn(String reasonForReturn) {
        System.out.printf("Возврат возможен " + reasonForReturn + "\n");
        return true;
    }

    /**
     * Метод возвращает товар по его номеру позиции.
     */
    @Override
    public boolean returnOrder(int orderId) {
        // код для возврата товара
        System.out.printf("Номер позиции возврата: %d\n", orderId);
        return true;

    }
}
