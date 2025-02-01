package hashmapandfunction.customhashmap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> hashMap = new CustomHashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert (put)");
            System.out.println("2. Retrieve (get)");
            System.out.println("3. Delete (remove)");
            System.out.println("4. Display HashMap");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (integer): ");
                    int key = sc.nextInt();
                    System.out.print("Enter value (string): ");
                    String value = sc.next();
                    hashMap.put(key, value);
                    System.out.println("Inserted successfully!");
                    break;
                case 2:
                    System.out.print("Enter key to retrieve: ");
                    key = sc.nextInt();
                    String result = hashMap.get(key);
                    System.out.println(result != null ? "Value: " + result : "Key not found!");
                    break;
                case 3:
                    System.out.print("Enter key to delete: ");
                    key = sc.nextInt();
                    hashMap.remove(key);
                    System.out.println("Deleted successfully!");
                    break;
                case 4:
                    hashMap.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
