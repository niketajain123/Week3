package circularlinkedlist.roundrobinalgorithm;

public class ProcessLinkedList {
    private ProcessNode head;
    private ProcessNode tail;
    int size = 0; // indicating the size of the linked list

    // adding process
    public void addProcess(int processId, int burstTime, int priority) {
        // initializing objects
        ProcessNode newProcess = new ProcessNode(processId, burstTime, priority);

        // edge case
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        size++; // increment size
    }

    // removing process with process id
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // find the process to be removed
        ProcessNode current = head;
        ProcessNode previous = null;

        do {
            if (current.getProcessId() == processId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                size--;
                System.out.println("Process " + processId + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process " + processId + " not found.");
    }

    // Simulate Round Robin Scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int[] waitingTime = new int[size];
        int[] turnAroundTime = new int[size];
        int[] remainingTime = new int[size];
        ProcessNode current = head;
        int index = 0;

        // Initialize remaining time for all processes
        do {
            remainingTime[index] = current.getBurstTime();
            current = current.next;
            index++;
        } while (current != head);

        int time = 0;
        boolean allProcessesCompleted = false;

        while (!allProcessesCompleted) {
            allProcessesCompleted = true;
            current = head;
            index = 0;

            do {
                if (remainingTime[index] > 0) {
                    allProcessesCompleted = false;

                    if (remainingTime[index] > timeQuantum) {
                        time += timeQuantum;
                        remainingTime[index] -= timeQuantum;
                    } else {
                        time += remainingTime[index];
                        waitingTime[index] = time - current.getBurstTime();
                        remainingTime[index] = 0;
                        turnAroundTime[index] = time;
                    }
                }
                current = current.next;
                index++;
            } while (current != head);

            displayProcesses();
        }

        calculateAndDisplayAvgTimes(waitingTime, turnAroundTime);
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ProcessNode current = head;
        System.out.println("Processes in the circular queue:");
        do {
            System.out.println("Process ID: " + current.getProcessId() + ", Burst Time: " + current.getBurstTime() + ", Priority: " + current.getPriority());
            current = current.next;
        } while (current != head);
    }

    // Calculate and display average waiting time and turn-around time
    private void calculateAndDisplayAvgTimes(int[] waitingTime, int[] turnAroundTime) {
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        for (int i = 0; i < size; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnAroundTime += turnAroundTime[i];
        }

        double avgWaitingTime = (double) totalWaitingTime / size;
        double avgTurnAroundTime = (double) totalTurnAroundTime / size;

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }
}
