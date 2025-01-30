package singlylinkedlist.inventorymanagementsystem;

import singlylinkedlist.studentrecordmanagement.StudentNode;

public class ItemLinkedList {
    private ItemNode head;

    private int count() {
        int c = 0;
        ItemNode temp = head;
        while (temp != null) {
            c++;
            temp = temp.getNext();
        }
        return c;
    }

    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        item.setNext(head);
        head = item;
    }

    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = item;
            return;
        }
        ItemNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(item);
    }

    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        int count = count();
        if (position <= 0 || position > count + 1) {
            System.out.println("Invalid position!");
            return;
        }
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        int pos = 1;
        if (position == 1) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        ItemNode temp = head;
        ItemNode prev = null;
        while (pos < position) {
            pos++;
            prev = temp;
            temp = temp.getNext();
        }
        item.setNext(temp);
        prev.setNext(item);
        System.out.println(item.getItemName() + " added at " + pos + "!");

    }

    public void removeById(int id) {
        if (head == null) {
            System.out.println("Item list is empty!");
            return;
        }
        if(head.getItemID()==id) {
            head = head.getNext();
            return;
        }
        ItemNode temp = head;
        ItemNode prev = null;
        while (temp != null && temp.getItemID() != id) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("Item with ID " + id + " not present!");
        } else {
            prev.setNext(temp.getNext());
        }
    }

    public void updateQuantityByID(int id, int quantity) {
        if (head == null) {
            System.out.println("Item list is empty!");
            return;
        }
        ItemNode temp = head;
        ItemNode prev = null;
        while (temp != null && temp.getItemID() != id) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("Item with ID " + id + " not present!");
        } else {
            temp.setQuantity(quantity);
            System.out.println("Quantity updated!");
        }
    }

    public void searchItemById(int id) {
        if (head == null) {
            System.out.println("Item list is empty!");
            return;
        }
        ItemNode temp = head;
        ItemNode prev = null;
        while (temp != null && temp.getItemID() != id) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("Item with item id " + id + " not present!");
        } else {
            System.out.println("Item found...");
            System.out.println(temp.toString());
        }
    }

    public void searchItemByName(String name) {
        if (head == null) {
            System.out.println("Item list is empty!");
            return;
        }
        ItemNode temp = head;
        ItemNode prev = null;
        while (temp != null && !temp.getItemName().equals(name)) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("Item " + name + " is not present!");
        } else {
            System.out.println("Item found...");
            System.out.println(temp.toString());
        }
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        ItemNode temp = head;
        while (temp != null) {
            totalValue = temp.getQuantity() * temp.getPrice();
            temp = temp.getNext();
        }
        System.out.println("Total value of inventory : " + totalValue);
    }

    //    public void sortingInventoryBasedOnPrice(){
//        if(head==null){
//            System.out.println("Item list is empty!");
//            return;
//        }
//        if(head.getNext()==null){
//            System.out.println("List is sorted!");
//            return;
//        }
//        ItemNode temp=head;
//        ItemNode prev=null;
//        int count=count();
//        for(int i=0;i<count;i++){
//
//            while()
//        }
//    }
    public void sortingInventoryBasedOnPrice() {
        ItemNode currNode = head;
        int len = count();
        int itr = 0;
        boolean swapped;

        // Iterating over the whole linked list
        while (itr < len) {
            ItemNode traverseNode = head;
            ItemNode prevNode = head;
            swapped = false;

            while (traverseNode.getNext() != null) {

                // Temporary pointer to store the next
                // pointer of traverseNode
                ItemNode ptr = traverseNode.getNext();
                if (traverseNode.getPrice() > ptr.getPrice()) {
                    swapped = true;
                    if (traverseNode == head) {

                        // Performing swap operations and
                        // updating the head of the linked
                        // list
                        traverseNode.setNext(ptr.getNext());
                        ptr.setNext(traverseNode);
                        prevNode = ptr;
                        head = prevNode;
                    } else {

                        // Performing swap operation
                        traverseNode.setNext(ptr.getNext());
                        ptr.setNext(traverseNode);
                        prevNode.setNext(ptr);
                        prevNode = ptr;
                    }
                    continue;
                }
                prevNode = traverseNode;
                traverseNode = traverseNode.getNext();
            }

            // If no swap occurred, break the loop
            if (!swapped) {
                break;
            }

            itr++;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty...");
            return;
        }
        ItemNode temp=head;
        while (temp!=null){
            System.out.println(temp.toString());
            System.out.println("===============");
            temp=temp.getNext();
        }
    }
}
