package Interfases;

/*
 * Интерфейс iQueueBehaviour определяет поведение очереди в магазине.
 */
public interface iQueueBehaviouer {
    /**
     * Добавляет клиента в очередь.
     * 
     * @param actor клиент, которого нужно добавить в очередь
     */
    void takeInQueue(iActorBehaviour actor);

    /*
     * Удаляет клиента из очереди.
     */
    void releaseFromQueue();

    /*
     * Принимает заказ от клиента в очереди.
     */
    void takeOrder();

    /*
     * Дает заказ клиенту в очереди.
     */
    void giveOrder();


}
