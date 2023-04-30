import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.PromoClient;
import Interfases.iActorBehaviour;
/*
 * Главный класс приложения.
 */
public class App1 {
    public static void main(String[] args) throws Exception {
    // Market market = new Market();
    // OrdinaryClient client1 = new OrdinaryClient("Boris");
    // OrdinaryClient client2 = new OrdinaryClient("Dasha");
    // SpecialClient client3 = new SpecialClient("Anton",1101);
    // market.acceptToMarket(client1);
    // market.acceptToMarket(client2);
    // market.acceptToMarket(client3);
    // market.update();

    Market market = new Market();
    // Обычный клиент
    iActorBehaviour client1=new OrdinaryClient("Boris");
    iActorBehaviour client2=new OrdinaryClient("Dasha");
    // Специальный клиент
    iActorBehaviour client3=new SpecialClient("Anton",1101);
    // Акционный клиент
    iActorBehaviour client4 = new PromoClient("Human01", "CashBack");
    iActorBehaviour client5 = new PromoClient("Human02", "CashBack");
    iActorBehaviour client6 = new PromoClient("Human03", "CashBack");
    iActorBehaviour client7 = new PromoClient("Human04", "CashBack");
    market.acceptToMarket(client1);
    market.acceptToMarket(client2);
    market.acceptToMarket(client3);
    market.acceptToMarket(client4);
	// Возврат товара четвертым клиентом (номер товара 345)
    client4.getActor().getReasonForReturn("Бракованный товар");
	client4.getActor().returnOrder(345);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    market.acceptToMarket(client5);
    market.acceptToMarket(client6);
    market.acceptToMarket(client7);

    market.update();
    }
}
