package circularlinkedlist.taskscheduler;

public class TaskLinkedList {
    private TaskNode head;
    private TaskNode currentTask;

    private int count() {
        int c = 0;
        if (head == null)
            return 0;
        TaskNode temp = head;
        do {
            c++;
            temp = temp.getNext();
        } while (temp != head);
        return c;
    }

    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode task = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = task;
            currentTask = head;
            task.setNext(task);
            return;
        }
        task.setNext(head);
        TaskNode temp = head;
        do {
            temp = temp.getNext();
        } while (temp.getNext() != head);
        temp.setNext(task);
        head = task;
    }

    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode task = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = task;
            currentTask = head;
            task.setNext(task);
            return;
        }
        TaskNode temp = head;
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(task);
        task.setNext(head);
    }

    public void addAtPosition(int id, String name, int priority, String date, int position) {
        if (position <= 0 || position > count() + 1) {
            System.out.println("Invalid position.");
            return;
        }
        TaskNode task = new TaskNode(id, name, priority, date);
        if (position == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }
        if (position == count() + 1) {
            addAtEnd(id, name, priority, date);
            return;
        }
        int pos = 1;
        TaskNode temp = head;
        TaskNode prev = null;
        while (pos < position) {
            pos++;
            prev=temp;
            temp = temp.getNext();
        }
        prev.setNext(task);
        task.setNext(temp);
    }

    public void removeTaskById(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.getTaskId() == id) {
            if (head.getNext() == head) {
                head = null;
                return;
            }
            TaskNode p = head;
            while (p.getNext() != head)
                p = p.getNext();
            head = head.getNext();
            p.setNext(head);
            return;
        }
        TaskNode temp = head, prev = null;
        do {
            prev = temp;
            temp = temp.getNext();
        } while (temp != head && temp.getTaskId() != id);
        if (temp == head) {
            System.out.println("No item with id " + id + " is present in list ");
            return;
        } else {
            prev.setNext(temp.getNext());
        }
    }

    public void viewCurrentTask() {
        if (currentTask != null) {
            System.out.println(currentTask.toString());
        } else {
            System.out.println("Task is not available!");
        }
    }

    public void moveNextTask() {
        if (currentTask != null) {
            viewCurrentTask();
            currentTask = currentTask.getNext();

        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        TaskNode temp = head;
        do {
            System.out.println(temp);
            System.out.println("=================");
            temp = temp.getNext();
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        TaskNode temp = head;
        do {
            if (temp.getPriority() == priority)
                break;
            temp = temp.getNext();
        } while (temp != head);
        if (temp == head && head.getPriority() != priority) {
            System.out.println("Item with priority " + priority + " not found.");
            return;
        } else {
            System.out.println(temp);
        }
    }
}



