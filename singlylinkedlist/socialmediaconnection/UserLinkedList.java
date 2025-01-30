package singlylinkedlist.socialmediaconnection;
import java.util.*;
public class UserLinkedList {
    private UserNode head;

    // Constructor
    public UserLinkedList () {
        this.head = null;
    }

    // Add a user to the list
    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove a friend connection between two users
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    public List<Integer> findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);
        List<Integer> mutualFriends = new ArrayList<>();
        if (user1 != null && user2 != null) {
            for (int id : user1.getFriendIds()) {
                if (user2.getFriendIds().contains(id)) {
                    mutualFriends.add(id);
                }
            }
        }
        return mutualFriends;
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of User " + user.getName() + ": " + user.getFriendIds());
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by Name or User ID
    public UserNode searchUser(String nameOrId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.getName().equals(nameOrId) || String.valueOf(temp.getUserId()).equals(nameOrId)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    // Count the number of friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("User " + temp.getName() + " has " + temp.getFriendIds().size() + " friends.");
            temp = temp.getNext();
        }
    }

    // Helper method to find a user by ID
    private UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.getUserId() == userId) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
}
