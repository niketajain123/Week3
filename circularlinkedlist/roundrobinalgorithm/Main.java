package circularlinkedlist.roundrobinalgorithm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProcessLinkedList cll = new ProcessLinkedList();

        // Add processes
        cll.addProcess(1, 10, 2);
        cll.addProcess(2, 5, 1);
        cll.addProcess(3, 8, 3);

        // Display processes
        cll.displayProcesses();

        // Simulate Round Robin Scheduling with time quantum = 3
        cll.simulateRoundRobin(3);

        // Remove a process
        cll.removeProcess(2);

        // Display processes after removal
        cll.displayProcesses();
    }
}
