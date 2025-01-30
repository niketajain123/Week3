package singlylinkedlist.socialmediaconnection;

import java.util.*;

public class UserNode {
    private int userId;
    private String name;
    private int age;
    private List<Integer> friendIds;
    private UserNode next;

    // Constructor
    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getFriendIds() {
        return friendIds;
    }

    public UserNode getNext() {
        return next;
    }

    public void setNext(UserNode next) {
        this.next = next;
    }

    // Add a friend
    public void addFriend(int friendId) {
        if (!friendIds.contains(friendId)) {
            friendIds.add(friendId);
        }
    }

    // Remove a friend
    public void removeFriend(int friendId) {
        friendIds.remove(Integer.valueOf(friendId));
    }
}
