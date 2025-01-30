package circularlinkedlist.taskscheduler;

public class TaskNode {
    private final int taskId;
    private String taskName;
    private int priority;
    private String date;
    private TaskNode next;
    private TaskNode prev;

    public TaskNode(int taskId, String taskName, int priority, String date) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.date = date;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode next) {
        this.next = next;
    }

    public TaskNode getPrev() {
        return prev;
    }

    public void setPrev(TaskNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "TaskId=" + taskId +
                "\nTaskName=" + taskName  +
                "\nPriority=" + priority +
                "\nDate=" + date;
    }
}
