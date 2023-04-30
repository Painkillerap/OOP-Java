package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfases.iActorBehaviour;
import Interfases.iMarketbehaviour;
import Interfases.iQueueBehaviouer;
import Interfases.iReturnOrder;

/*
 * Класс Market реализует интерфейсы iMarketBehaviour и iQueueBehaviour.
 * Он представляет собой магазин, в котором клиенты могут делать заказы и ждать своей очереди.
 */
public class Market implements iMarketbehaviour, iQueueBehaviouer, iReturnOrder {
    // Список клиентов, которые находятся в очереди
    private List<iActorBehaviour> queue;

    /*
     * Конструктор класса создает новый экземпляр класса ArrayList<iActorBehaviour>
     * для хранения очереди клиентов.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод acceptToMarket принимает клиента и добавляет его в магазин.
     * 
     * @param actor - клиент, который пришел в магазин
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " Клиент пришел в магазин");
        takeInQueue(actor);
    }

    /**
     * Метод takeInQueue добавляет клиента в очередь.
     * 
     * @param actor - клиент, который ждет своей очереди
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " Клиент добавлен в очередь");
    }

    /**
     * Метод releaseFromMarket удаляет клиента из магазина.
     * 
     * @param actors - список клиентов, которые уходят из магазина
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " Клиент ушел из магазина");
            this.queue.remove(actor);
        }
    }

    /**
     * Метод update вызывает методы takeOrder, giveOrder, returnOrder и
     * releaseFromQueue.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод giveOrder выдает заказ клиенту, если он сделал заказ.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " Клиент получил свой заказ");
            }
        }
    }

    /**
     * Метод releaseFromQueue удаляет клиента из очереди, если он получил свой
     * заказ.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> relieaseActors = new ArrayList<Actor>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                relieaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " Клиент ушел из очереди");
            }
        }
        releaseFromMarket(relieaseActors);
    }

    /**
     * Метод takeOrder принимает заказ от клиента, если он еще не сделал заказ.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isTakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " Клиент сделал свой заказ");
            }
        }
    }

    /**
     * Метод getReasonForReturn проверяет есть ли возможность вернуть товар.
     */
    @Override
    public boolean getReasonForReturn(String reasonForReturn) {
        System.out.printf("Возврат возможен", reasonForReturn);
        return true;
    }

    // Метод returnOrder возвращает заказ от клиента, если есть возможность.

    @Override
    public boolean returnOrder(int orderId) {
        System.out.printf("Номер позиции возврата: %d\n", orderId);
        return true;
    }
}
