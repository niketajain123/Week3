package circularlinkedlist.roundrobinalgorithm;

public class ProcessNode {
    private int processId;
    private int burstTime;
    private int priority;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ProcessId=" + processId +
                "\nBurstTime=" + burstTime +
                "\nPriority=" + priority;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ProcessNode getNext() {
        return next;
    }

    public void setNext(ProcessNode next) {
        this.next = next;
    }
}
