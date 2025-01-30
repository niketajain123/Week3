package singlylinkedlist.inventorymanagementsystem;

public class ItemNode {
    private String itemName;
    private int itemID;
    private int quantity;
    private double price;
    private ItemNode next;

    @Override
    public String toString() {
        return "ItemName='" + itemName + "\'\n" +
                "ItemID=" + itemID +
                "\nQuantity=" + quantity +
                "\nPrice=" + price;
    }

    public ItemNode(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemNode getNext() {
        return next;
    }

    public void setNext(ItemNode next) {
        this.next = next;
    }
}
