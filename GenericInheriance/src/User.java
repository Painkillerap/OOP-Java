
/**
 * Класс, представляющий пользователя системы.
 */
public class User <T,V>{
    
    private T firstName; // Имя пользователя
    private T secondName; // Фамилия пользователя
    private V age; // Возраст пользователя
    private T address; // Адрес пользователя
    
    /**
     * Конструктор класса User.
     * @param firstName Имя пользователя
     * @param secondName Фамилия пользователя
     * @param age Возраст пользователя
     * @param address Адрес пользователя
     */
    public User(T firstName, T secondName, V age, T address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }
    
    /**
     * Метод для получения имени пользователя.
     * @return Имя пользователя
     */
    public T getFirstName() {
        return firstName;
    }
    
    /**
     * Метод для получения фамилии пользователя.
     * @return Фамилия пользователя
     */
    public T getSecondName() {
        return secondName;
    }
    
    /**
     * Метод для получения возраста пользователя.
     * @return Возраст пользователя
     */
    public V getAge() {
        return age;
    }
    
    /**
     * Метод для получения адреса пользователя.
     * @return Адрес пользователя
     */
    public T getAddress() {
        return address;
    }
    
    /**
     * Метод для установки имени пользователя.
     * @param firstName Имя пользователя
     */
    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Метод для установки фамилии пользователя.
     * @param secondName Фамилия пользователя
     */
    public void setSecondName(T secondName) {
        this.secondName = secondName;
    }
    
    /**
     * Метод для установки возраста пользователя.
     * @param age Возраст пользователя
     */
    public void setAge(V age) {
        this.age = age;
    }
    
    /**
     * Метод для установки адреса пользователя.
     * @param address Адрес пользователя
     */
    public void setAddress(T address) {
        this.address = address;
    }
    
    /**
     * Переопределение метода toString() для вывода информации о пользователе.
     * @return Информация о пользователе
     */
    @Override
    public String toString()
    {
        return  "User{" +
        "Имя = " + firstName  +
        ", Фамилия = " + secondName +
        ", Возраст = " + age +
        ", Адрес = " + address +
        '}';
    }
}