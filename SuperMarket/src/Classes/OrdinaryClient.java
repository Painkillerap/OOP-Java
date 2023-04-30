package Classes;

/**
 * Класс, представляющий обычного клиента.
 */
public class OrdinaryClient extends Actor {
    /**
     * Конструктор класса OrdinaryClient.
     * 
     * @param name имя клиента
     */
    public OrdinaryClient(String name) {
        super(name);
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
