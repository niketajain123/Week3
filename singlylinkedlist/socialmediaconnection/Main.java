package singlylinkedlist.socialmediaconnection;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        UserLinkedList socialMedia = new UserLinkedList();

        // Add users
        socialMedia.addUser(1, "Alice", 25);
        socialMedia.addUser(2, "Bob", 30);
        socialMedia.addUser(3, "Charlie", 22);
        socialMedia.addUser(4, "David", 28);
        System.out.println();
        // Add friend connections
        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);
        socialMedia.addFriendConnection(2, 4);
        socialMedia.addFriendConnection(3, 4);

        System.out.println();
        // Display friends of a specific user
        socialMedia.displayFriends(1); // Friends of Alice: [2, 3]

        // Find mutual friends
        List<Integer> mutualFriends = socialMedia.findMutualFriends(1, 4);
        System.out.println("Mutual friends between Alice and David: " + mutualFriends);

        // Remove a friend connection
        socialMedia.removeFriendConnection(1, 3);
        socialMedia.displayFriends(1); // Friends of Alice: [2]

        // Search for a user by Name or User ID
        UserNode user = socialMedia.searchUser("Bob");
        if (user != null) {
            System.out.println("User found: " + user.getName());
        }

        // Count the number of friends for each user
        socialMedia.countFriends();
    }
}
