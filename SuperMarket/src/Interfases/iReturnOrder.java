package Interfases;

//Реализация метода интерфейса iReturnOrder для проверки возможности возврата товара
public interface iReturnOrder {
    // метод, который принимает на вход ID заказа и товары, которые необходимо вернуть.
boolean returnOrder(int orderId);
    // метод, который позволяет получить причину возврата товара;
boolean getReasonForReturn(String reasonForReturn);

}

