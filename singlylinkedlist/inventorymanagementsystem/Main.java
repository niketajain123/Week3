package singlylinkedlist.inventorymanagementsystem;
import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
                ItemLinkedList items=new ItemLinkedList();
                int choice;
                Scanner sc=new Scanner(System.in);
                do{

                        System.out.println("Enter 1 for adding item at beginning.");
                        System.out.println("Enter 2 for adding item at end.");
                        System.out.println("Enter 3 for adding item at specific position.");
                        System.out.println("Enter 4 for deleting item by itemID.");
                        System.out.println("Enter 5 for searching item by itemID.");
                        System.out.println("Enter 6 for searching item by name.");
                        System.out.println("Enter 7 for updating item's quantity by itemID.");
                        System.out.println("Enter 8 for displaying item list.");
                        System.out.println("Enter 9 for displaying total value of inventory.");
                        System.out.println("Enter 10 for sorting the inventory on the basis of price.");
                        System.out.println("Enter 0 for exit.");
                        choice=sc.nextInt();
                        switch (choice){
                                case 1 :
                                        System.out.println("Enter name, id, quantity and price of item: ");
                                        items.addItemAtBeginning(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
                                        break;

                                case 2 :
                                        System.out.println("Enter name, id, quantity and price of item: ");
                                        items.addItemAtEnd(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
                                        break;
                                case 3 :
                                        System.out.println("Enter name, id, quantity, price and position of item: ");
                                        items.addItemAtPosition(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
                                        break;
                                case 4 :
                                        System.out.println("Enter itemID of item to be deleted : ");
                                        items.removeById(sc.nextInt());
                                        break;
                                case 5 :
                                        System.out.println("Enter itemId of item to be searched : ");
                                        items.searchItemById(sc.nextInt());
                                        break;
                                case 6 :
                                        System.out.println("Enter item name of item to be searched : ");
                                        items.searchItemByName(sc.next());
                                        break;
                                case 7 :
                                        System.out.println("Enter itemId and quantity of item to be updated : ");
                                        items.updateQuantityByID(sc.nextInt(), sc.nextInt());
                                        break;
                                case 8 :
                                        System.out.println("Inventory Items...");
                                        items.display();
                                        break;
                                case 9 :
                                        items.calculateTotalValue();
                                        break;
                                case 10 :
                                        System.out.println("Sorted item list on the basis of price : ");
                                        items.sortingInventoryBasedOnPrice();
                                        items.display();
                                        break;
                                case 0 :
                                        break;
                                default:
                                        System.out.println("Invalid choice!");
                        }

                }while (choice!=0);
        }
}
