
public abstract class ItemGenerator {
    public void openRerward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    } 

    public abstract iGameItem createItem();
}
