public class Item {
    private String itemName;
    private String addingTime;

    public Item(String name, String addingTime)
    {
        this.itemName = name;
        this.addingTime = addingTime;
    }
    public String toString()
    {
        return "Item name is " + this.itemName + " Added at : " + this.addingTime;
    }

}
